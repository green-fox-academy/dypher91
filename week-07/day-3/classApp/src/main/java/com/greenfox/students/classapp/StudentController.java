package com.greenfox.students.classapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/gfa")
    public String listNames(){

        return "info";
    }

    @RequestMapping("/gfa/list")
    public String listNames(Model model){
        model.addAttribute("namesList", studentService.findAll());
        return "liststudent";
    }


}
