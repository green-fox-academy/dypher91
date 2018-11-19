package com.greenfox.dypher91.demo.repository;

import com.greenfox.dypher91.demo.modules.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {

    Todo findAllById(Long id);

}