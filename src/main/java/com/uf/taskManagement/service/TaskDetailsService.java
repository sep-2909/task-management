package com.uf.taskManagement.service;

import com.uf.taskManagement.model.TaskDetails;
import com.uf.taskManagement.repository.TaskDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TaskDetailsService {

    @Autowired
    private TaskDetailsRepository taskDetails;

    public TaskDetails getTaskDetailsById(Long taskId) {
        return taskDetails.findById(taskId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task details not found for this task id: "+taskId));
    }

    public List<TaskDetails> getAllTaskDetails() {
        return taskDetails.findAll();
    }

    public String createTask(TaskDetails singleTaskDetails){
        taskDetails.save(singleTaskDetails);
        return "Task added successfully.";
    }

    public String updateTask(TaskDetails singleTaskDetails, Long taskId){
        Optional<TaskDetails> details = taskDetails.findById(taskId);
        if(details.isPresent()){
            singleTaskDetails.setId(taskId);
            taskDetails.save(singleTaskDetails);
            return "Task updated successfully.";
        }
        return "No task found!!!";
    }

    public String deleteTask(Long taskId){
        Optional<TaskDetails> details = taskDetails.findById(taskId);
        if(details.isPresent()){
            TaskDetails deleteTask = details.get();
            taskDetails.delete(deleteTask);
            return "Task deleted successfully.";
        }
        return "No task found!!!";
    }
}

