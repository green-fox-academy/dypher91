package com.example.greenfox.exercise2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Exercise2Application implements CommandLineRunner {
    @Autowired
    MyColor color;
    Printer printer;


    @Autowired
    public Exercise2Application(MyColor color, Printer printer) {
        this.color = color;
        this.printer = printer;
    }


    public static void main(String[] args) {
        SpringApplication.run(Exercise2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        printer.log(color.printColor());


    }
}
