package com.cypsolabs.task_app.service;

import com.cypsolabs.task_app.exception.TaskNotFoundException;
import com.cypsolabs.task_app.model.Task;
import com.cypsolabs.task_app.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask (Task task){
        return taskRepository.save(task);
    }
    
    public List<Task> getAllTasks() { //get all tasks
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) { //get task by id
        return taskRepository.findById(id);
    }

    public Task updateTask(Long id, Task task) { //update task by id
        Task existingTask = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        existingTask.setTitle(task.getTitle());
        existingTask.setStatus(task.getStatus());
        existingTask.setDescription(task.getDescription());
        return taskRepository.save(existingTask);
    }

    // public void deleteTaskById(Long id) {
    //     if (!taskRepository.existsById(id)) {
    //         throw new TaskNotFoundException("Task with id " + id + " not found");
    //     }
    //     taskRepository.deleteById(id);
    // }

    public void deleteTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        taskRepository.delete(task);
    }
}
