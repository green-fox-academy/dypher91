package com.greenfox.dypher91.bankofsimba.controller;

import com.greenfox.dypher91.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.RoundingMode;
import java.text.DecimalFormat;

@Controller
public class ShowAcc {

    @RequestMapping("/show")
    public String showAcc(Model model){

        BankAccount accSimba = new BankAccount("Simba", 2000, "lion","zebra","good");
        String showSimba = accSimba.getName()+" "+ accSimba.getBalance()+" "+ accSimba.getAnimalType()+" "+accSimba.getCurrency()+" "+accSimba.getStatus();
        model.addAttribute("accountSimba", showSimba);

        return "showacc";

    }
}
