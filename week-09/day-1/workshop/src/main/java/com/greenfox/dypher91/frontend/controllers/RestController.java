package com.greenfox.dypher91.frontend.controllers;


import com.greenfox.dypher91.frontend.models.Doubling;
import com.greenfox.dypher91.frontend.models.ErrorResponse;
import com.greenfox.dypher91.frontend.models.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @RequestMapping(value = "/doubling", method = RequestMethod.GET, produces = "application/json")
    public Object doubleInput(@RequestParam(value = "input", required = false) Integer input) {
        ErrorResponse error = new ErrorResponse("Please provide an input!");
        if (input == null) {
            return error;
        }
        Doubling doubling = new Doubling(input);
        doubling.setResult(input * 2);

        return doubling;
    }

    @RequestMapping(value = "greeter",method = RequestMethod.GET, produces = "application/json")
    public Object greetSomebody(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "title",required = false) String title){
        ErrorResponse error = new ErrorResponse();
        if (name == null) {
            error.setError("Please provide a name!");
            return error;
        }else if (title == null){
            error.setError("Please provide a title!");
            return error;
        }
        Greetings greeter = new Greetings("");
        greeter.setWelcomeMessage(name,title);
        return greeter;
    }
}

