package com.greenfox.dypher91.frontend.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @GetMapping(value = "/")
    public String showpage(){
        return "index";
    }




}
