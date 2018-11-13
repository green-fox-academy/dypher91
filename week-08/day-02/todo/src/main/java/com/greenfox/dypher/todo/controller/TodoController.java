package com.greenfox.dypher.todo.controller;

import com.greenfox.dypher.todo.repository.TodoRepository;
import com.greenfox.dypher.todo.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepository;
    @Autowired
    todoService todoservice;


    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/list","/"})
    public String list(Model model){
        model.addAttribute("todolist",todoRepository.findAll());

        return "todolist";

    }
    @GetMapping("/isActive")
    public String list(@RequestParam(value = "isActive", defaultValue = "true") Boolean isActive, Model model) {
        model.addAttribute("todolist", todoservice.listThem(isActive));
        return "todolist";
    }



}
