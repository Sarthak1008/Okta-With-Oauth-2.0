package com.example.Okta.Single.Sign.In.with.Oauth20.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicationController {
    @GetMapping("/")
    public String welcome2User(Principal principal) {
        return "Hi " + principal.getName() + " Welcome to javatechie";
    }
}
