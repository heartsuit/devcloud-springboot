package com.heartsuit.showcase.modules.web.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello DevCloud.";
    }

    @PostMapping("/greeting")
    public String greeting(@RequestBody HashMap<String, String> params) {
        return "Hello DevOps. Welcome " + params.get("name");
    }
}