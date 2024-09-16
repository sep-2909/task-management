package com.uf.taskManagement.controller;

import com.uf.taskManagement.model.TaskDetails;
import com.uf.taskManagement.service.TaskDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskDetailsController {

    @Autowired
    private TaskDetailsService taskDetailsService;

    @GetMapping("/getAllTasks")
    public List<TaskDetails> getAllTaskDetails(){
        return taskDetailsService.getAllTaskDetails();
    }

    @GetMapping("/getAllTasks/{taskId}")
    public TaskDetails getTaskDetailsById(@PathVariable Long taskId){
        return taskDetailsService.getTaskDetailsById(taskId);
    }

    @PostMapping("/addTask")
    public String addTaskDetails(@RequestBody TaskDetails taskDetails){
        return taskDetailsService.createTask(taskDetails);
    }

    @PutMapping("/updateTask/{taskId}")
    public String updateTaskDetails(@RequestBody TaskDetails taskDetails, @PathVariable Long taskId){
        return taskDetailsService.updateTask(taskDetails, taskId);
    }
}
