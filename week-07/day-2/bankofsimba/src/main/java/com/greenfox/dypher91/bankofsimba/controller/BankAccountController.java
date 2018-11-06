package com.greenfox.dypher91.bankofsimba.controller;

import com.greenfox.dypher91.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {
    List<BankAccount> bank = Arrays.asList(new BankAccount("Scar",0,"king","zebra","bad"),
            (new BankAccount("Timon", 1500, "meerkat","pig","good")),
            (new BankAccount("Rafiky",100,"monkey","bananas","good")),
            (new BankAccount("Simba",500,"king","deer","good")),
            (new BankAccount("Zazu",10,"bird","peanuts","bad")),
            (new BankAccount("Pumba",1000,"pig","fruits","good")));



    @GetMapping("/bank")
    public String bank(Model model){
        model.addAttribute("animalList", bank);
        int borderSize = 2;
        model.addAttribute("borderSize", borderSize);

        return "bankinfos";

    }

    @PostMapping("/increasebalance")
    public String increase() {
        for (int i = 0; i < bank.size(); i++) {
            if ( bank.get(i).getStatus().equals("king")) {
                bank.get(i).setBalance( bank.get(i).getBalance() + 100);
            } else {
                bank.get(i).setBalance( bank.get(i).getBalance() + 10);
            }
        }
        return "redirect:/bank";
    }
}
