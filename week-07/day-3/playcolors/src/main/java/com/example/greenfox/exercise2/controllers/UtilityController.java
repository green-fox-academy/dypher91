package com.example.greenfox.exercise2.controllers;

import com.example.greenfox.exercise2.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilityController {

    @Autowired
    Utility utility;


    @RequestMapping("/useful")
    public String useful(Model model) {
        model.addAttribute("colors", utility.getUtilities());
        model.addAttribute("emailValid", "is@this.valid");
        return "useful";
    }

    @RequestMapping("/useful/colored/{color}")
    public String coloredPage(@PathVariable(value = "color") String color, Model model) {
        model.addAttribute("color",color);
        return "background";
    }

    @RequestMapping("/useful/colored")
        public String randomColor (Model model) {
            model.addAttribute("colors", utility.getUtilities());
            model.addAttribute("randColor", utility.randomColor());
            return "useful";
        }



}
