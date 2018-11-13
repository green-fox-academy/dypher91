package com.greenfox.foxclub.dypher.programmerfoxclub.controllers;

import com.greenfox.foxclub.dypher.programmerfoxclub.models.Tricks;
import com.greenfox.foxclub.dypher.programmerfoxclub.service.FoxClub;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {
    FoxClub foxClub;
    Tricks trickPossibilities;

    public MainController() {
        foxClub = new FoxClub();
        trickPossibilities = new Tricks();
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/")
    public String getIndex(@RequestParam(value = "name", required = false) String foxNameInput, Model model) {
//        FoxClub foxClub = new FoxClub();
        if (foxNameInput == null)
            return "login";
        if (!foxClub.isMember(foxNameInput)) {
            foxClub.addMember(foxNameInput);
//            foxClub.findTheFox(foxNameInput).addAction("new Fox created");
        }
        model.addAttribute("fox", foxClub.findTheFox(foxNameInput));
        return "index";
    }

    @PostMapping("/login")
    public String loggedIn(@RequestParam(value = "foxname") String foxNameInput) {
        return "redirect:/?name=" + foxNameInput;
    }

    @PostMapping("/tricks")
    public String trickLearnede(@RequestParam(value = "name") String name, @ModelAttribute(value = "trick") String trick) {
        foxClub.findTheFox(name).learnTrick(trick);
        foxClub.findTheFox(name).addAction("New trick learned: " + trick + ".");
        return "redirect:/?name=" + name;
    }


    @GetMapping("/tricks")
    public String goTrickCenter(@RequestParam(value = "name", required = false) String foxNameInput, Model model) {
        if (foxNameInput != null) {
            model.addAttribute("fox", foxClub.findTheFox(foxNameInput));
            model.addAttribute("trickPossibilities", trickPossibilities);
            return "tricks";
        } else {
            return "redirect:/login";
        }
    }

}



