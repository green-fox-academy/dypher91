package com.greenfox.dypher91.demo.services;

import com.greenfox.dypher91.demo.modules.Todo;

public interface TodoService {
    void save(Todo todo);

    Todo findById(long id);

    void deleteById(long id);


}
