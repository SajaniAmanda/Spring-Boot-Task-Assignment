package com.cypsolabs.task_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//create task entity
@Entity
public class Task {

    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generated value
    private Long id;
    private String title;
    private String status;
    private String description; //"Pending", "In Progress", "Completed"

    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
