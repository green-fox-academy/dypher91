package com.example.greenfox.exercise2.controllers;

import com.example.greenfox.exercise2.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
            model.addAttribute("randColor", utility.randomColor());
            return "randBackground";
        }
    @RequestMapping(value = "/useful/email")
    public String email(@RequestParam(value = "email") String email, Model model) {
        model.addAttribute("emailAddress", email);
        model.addAttribute("isValid", utility.isValidEmail(email));
        return "email";
    }

    @RequestMapping("/useful/encode/{text}/{number}")
    public String encodeText(@PathVariable(value = "text") String text, @PathVariable(value = "number") int number, Model model) {
        model.addAttribute("text", utility.caesar(text, number));
        return "caesar";
    }

    @RequestMapping("/useful/decode/{text}/{number}")
    public String decodeText(@PathVariable(value = "text") String text, @PathVariable(value = "number") int number, Model model) {
        model.addAttribute("text", utility.caesar(text, -number));
        return "caesar";
    }



}
