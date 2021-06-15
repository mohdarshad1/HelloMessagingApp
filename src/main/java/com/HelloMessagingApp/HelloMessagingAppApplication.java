package com.HelloMessagingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMessagingAppApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hello Messaging App");
        SpringApplication.run(HelloMessagingAppApplication.class, args);
    }
}
