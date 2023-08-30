package com.store.api.controller;

import com.store.api.storage.model.User;
import com.store.api.storage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> hello (){
        return userRepository.findAll();
    }
}
