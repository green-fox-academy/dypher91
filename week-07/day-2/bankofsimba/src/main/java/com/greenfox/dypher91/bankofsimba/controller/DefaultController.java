package com.greenfox.dypher91.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("")
    public String defaultPage(Model model){
        String str = "Welcome at my webpage!";
        String path = "resource/static/logo.png";
        model.addAttribute("text",str);
        model.addAttribute("picture",path);

        return "default";
    }
}
