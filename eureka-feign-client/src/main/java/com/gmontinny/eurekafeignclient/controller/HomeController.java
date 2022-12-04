package com.gmontinny.eurekafeignclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping(path = "/check/{login}")
    public boolean check(@PathVariable("login") String login) {
        return new Random().nextBoolean();
    }
}
