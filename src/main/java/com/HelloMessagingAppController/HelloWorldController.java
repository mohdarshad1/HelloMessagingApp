package com.HelloMessagingAppController;

import org.springframework.web.bind.annotation.*;
import com.HelloMessagingAppModel.User;

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

 // Post Request:- Rest call: curl -X POST -H "Content-Type: application/json" -d '{\"firstName\": \”Mark\", \"lastName\": \”Taylor\"}'
    //                           "http://localhost:8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String hello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !!";
    }
}