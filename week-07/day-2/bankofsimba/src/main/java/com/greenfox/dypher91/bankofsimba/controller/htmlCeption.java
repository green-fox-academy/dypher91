package com.greenfox.dypher91.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmlCeption {

    @RequestMapping("/htmlception")
    public String htmlception(Model model){
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

        model.addAttribute("text",text);
        return "htmlception";

    }
}
