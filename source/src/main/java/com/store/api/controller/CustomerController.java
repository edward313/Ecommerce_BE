package com.store.api.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello (){
        return "hello";
    }
}
