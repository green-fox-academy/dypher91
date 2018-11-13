package com.greenfox.dypher.todo.repository;

import com.greenfox.dypher.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
