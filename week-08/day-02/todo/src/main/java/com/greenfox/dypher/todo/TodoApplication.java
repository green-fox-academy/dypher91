package com.greenfox.dypher.todo;

import com.greenfox.dypher.todo.model.Todo;
import com.greenfox.dypher.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        todoRepository.save(new Todo(("I have to learn Object Relational Mapping")));
//        todoRepository.save(new Todo(("I have to learn what I am doing")));
    }
}
