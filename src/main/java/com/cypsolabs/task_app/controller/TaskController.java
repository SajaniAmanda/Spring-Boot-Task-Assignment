// REST endpoints
package com.cypsolabs.task_app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.cypsolabs.task_app.model.Task;
import com.cypsolabs.task_app.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    //inject task service
    @Autowired
    private TaskService taskService; 

     //create task
    @PostMapping
    public Task createTask(@Validated @RequestBody Task task) {
        return taskService.createTask(task);
    }
    
    //get all tasks
    @GetMapping   
    public List<Task> getAllTasks() { 
        return taskService.getAllTasks();
    }

    //get task by id
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        return ResponseEntity.ok(task);
    }

    //update task
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @Validated @RequestBody Task task) {
        Task updatedTask = taskService.updateTask(id, task);
        return ResponseEntity.ok(updatedTask);
    }

    //delete task
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable Long id) {
        taskService.deleteTaskById(id);
        return ResponseEntity.ok("Task deleted successfully");
    }

}
