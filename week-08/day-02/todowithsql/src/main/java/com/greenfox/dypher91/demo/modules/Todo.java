package com.greenfox.dypher91.demo.modules;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private boolean isUrgent;
    private boolean isDone;
    private String description;

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate dueDate;



    public Todo() {
        this.isUrgent = false;
        this.isDone = false;
    }

    public Todo(String title, String description) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
        this.description=description;
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;

    }

    public Todo(LocalDate createdAt, LocalDate dueDate){
        this.createdAt = createdAt;
        this.dueDate = dueDate;

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

}

