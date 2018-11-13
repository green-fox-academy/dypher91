package com.greenfox.dypher.todo.model;

import javax.persistence.*;


@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue()
    long id;
    String title;
    boolean urgent;
    boolean done;

    public Todo(){
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done =false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
