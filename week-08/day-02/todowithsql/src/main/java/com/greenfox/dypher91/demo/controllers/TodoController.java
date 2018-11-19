package com.greenfox.dypher91.demo.controllers;

import com.greenfox.dypher91.demo.modules.Todo;
import com.greenfox.dypher91.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

    @Autowired
    TodoRepository repo;

    @RequestMapping({"", "/"})
    public String list(Model model) {
        model.addAttribute("Todo", new Todo());
        model.addAttribute("Todos", repo.findAll());
        return "index";
    }

        @GetMapping("/addT")
        public String input(Model model, @ModelAttribute Todo todo) {
            model.addAttribute("Todo", todo);
            return "addTask";
        }

    @GetMapping("/{id}/info")
    public String info(@PathVariable Long id, Model model) {
        model.addAttribute("Todo", repo.findAllById(id));
        return "info";
    }


    @PostMapping("/addN")
    public String addN (@ModelAttribute Todo todo){
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("Todo", repo.findAllById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Long id,
                         @RequestParam("title") String title,
                         @RequestParam(value = "isUrgent", required = false) boolean urgent,
                         @RequestParam(value = "isDone", required = false) boolean done){
        Todo todo = repo.findAllById(id);
        todo.setTitle(title);
        todo.setIsDone(done);
        todo.setIsUrgent(urgent);
        repo.save(todo);
        return "redirect:/";
    }


    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }

}
