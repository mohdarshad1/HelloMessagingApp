package com.HelloMessagingAppController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // GET Request :- Rest call: curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String hello(){
        return "Hello from Bridgelabz";
    }

    // Query Parameter
    // GET Request:- Rest call: curl localhost:8080/hello/query?name=Mark -w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name){
        return "Hello " + name + " !!";
    }

 // Path Variable
    // GET Request:- Rest call: curl localhost:8080/hello/param/Mark -w "\n"
    @GetMapping("/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name +" !!";
    }
}