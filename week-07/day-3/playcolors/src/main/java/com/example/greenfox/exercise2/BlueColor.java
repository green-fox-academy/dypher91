package com.example.greenfox.exercise2;


import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor{


    @Override
    public String printColor(){
        return "There is a blue color";
    }



}
