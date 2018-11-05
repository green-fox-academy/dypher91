package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;
import java.util.Random;

@Controller
public class SayHello {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colours = {"blue","pink","green","yellow","red","grey","brown"};

    String[] fontsize = { "28px", "44px", "160px", "180px", "50px", "240px", "320px", "40px"};

    Random rand = new Random();

    @RequestMapping("/secHello")
    public String sayHello(Model model){
        model.addAttribute("hellos",hellos[rand.nextInt(hellos.length)]);
        model.addAttribute("colours",colours[rand.nextInt(colours.length)]);
        model.addAttribute("fontsize", fontsize[rand.nextInt(fontsize.length)]);


        return "sayhellos";
    }
}
