package com.cypsolabs.task_app.repository;

import com.cypsolabs.task_app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
