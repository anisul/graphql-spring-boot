package com.ansnz.graphqlspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping(value = "/task")
    public String index() {
        return "Hello world";
    }

}
