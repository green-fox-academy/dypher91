package com.greenfox.dypher.todo.service;

import com.greenfox.dypher.todo.model.Todo;
import com.greenfox.dypher.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class todoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> listThem(Boolean isActive) {
        List<Todo> todoss = new ArrayList<>();
        for (Todo todo : todoRepository.findAll()) {
            if (isActive == null) {
                todoss.add(todo);
            } else if (isActive) {
                if (!todo.isDone()) {
                    todoss.add(todo);
                }
            } else if (!isActive) {
                if (todo.isDone()) {
                    todoss.add(todo);
                }
            }
        }
        return todoss;
    }




}