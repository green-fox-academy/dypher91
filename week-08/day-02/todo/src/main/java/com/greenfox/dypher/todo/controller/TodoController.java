package com.greenfox.dypher.todo.controller;

import com.greenfox.dypher.todo.model.Todo;
import com.greenfox.dypher.todo.repository.TodoRepository;
import com.greenfox.dypher.todo.service.TodoServ;
import com.greenfox.dypher.todo.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoRepository todoRepository;
    @Autowired
    todoService todoservice;

//     TodoServ todoServ;


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


    @GetMapping("/add")
    public String getAddPage() {
        return "addTodo";
    }


    @PostMapping("/add")
    public String addSubmit(@ModelAttribute(value = "newtodo")String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo/";
    }

    @PostMapping(value = "/{id}/delete")
    public String deleted(@PathVariable(value = "id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/";
    }


}
