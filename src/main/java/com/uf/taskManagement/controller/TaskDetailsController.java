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

    @GetMapping("/tasks")
    public List<TaskDetails> getAllTaskDetails(){
        return taskDetailsService.getAllTaskDetails();
    }

    @GetMapping("/tasks/{id}")
    public TaskDetails getTaskDetailsById(@PathVariable Long id){
        return taskDetailsService.getTaskDetailsById(id);
    }

    @PostMapping("/tasks")
    public String addTaskDetails(@RequestBody TaskDetails taskDetails){
        return taskDetailsService.createTask(taskDetails);
    }

    @PutMapping("/tasks/{id}")
    public String updateTaskDetails(@RequestBody TaskDetails taskDetails, @PathVariable Long id){
        return taskDetailsService.updateTask(taskDetails, id);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTaskDetails(@RequestBody TaskDetails taskDetails, @PathVariable Long id){
        return taskDetailsService.deleteTask(id);
    }
}
