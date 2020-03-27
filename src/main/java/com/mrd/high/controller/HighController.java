package com.mrd.high.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighController {

    @GetMapping("/redis/{id}")
    public Object highRedis(@PathVariable("id") String id) {
        return id;
    }

}
