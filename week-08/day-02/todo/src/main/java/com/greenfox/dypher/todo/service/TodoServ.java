package com.greenfox.dypher.todo.service;

import com.greenfox.dypher.todo.model.Todo;

import java.util.List;

public interface TodoServ {

    void save(Todo todo);

    Todo findById(long id);

    void deleteById(long id);

    List<Todo> getProperTodos(Boolean isActive, String searchedValue);
}

