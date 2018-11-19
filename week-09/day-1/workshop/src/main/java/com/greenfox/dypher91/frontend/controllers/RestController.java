package com.greenfox.dypher91.frontend.controllers;


import com.greenfox.dypher91.frontend.models.*;
import com.greenfox.dypher91.frontend.service.MainService;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    MainService mainService;


//    @Autowired
//    public RestController(MainService mainService) {
//        this.mainService = mainService;
//    }


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

    @RequestMapping(value = "/greeter", method = RequestMethod.GET, produces = "application/json")
    public Object greetSomebody(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        ErrorResponse error = new ErrorResponse();
        if (name == null) {
            error.setError("Please provide a name!");
            return error;
        } else if (title == null) {
            error.setError("Please provide a title!");
            return error;
        }
        Greetings greeter = new Greetings("");
        greeter.setWelcomeMessage(name, title);
        return greeter;
    }

    @RequestMapping(value = "/appenda/{appendable}")
    public Object appendLetterA(@PathVariable (value = "appendable")String appendable){
        return new AppendA(appendable);
    }

    @PostMapping(value = "dountil/{action}")
    public Object doUntilAction(@PathVariable (value = "action") String action, @RequestParam("until") Integer until){
        Result result = new Result();
        if (action.equals("sum")){
            result.setSum(result.sumNumber(until));
            System.out.println(until);
//            mainService.sumTheUntil(until);
        } else if (action.equals("factor")){
            result.factoNumber(until);
//            mainService.factorTheUntil(until);
        }
        return result;
    }
}


