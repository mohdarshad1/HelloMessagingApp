package com.HelloMessagingAppController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // GET Request :- Rest call: curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String hello(){
        return "Hello from Bridgelabz";
    }

    // GET Request:- Rest call: curl localhost:8080/hello/query?name=Mark -w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name){
        return "Hello " + name + " !!";
    }
}