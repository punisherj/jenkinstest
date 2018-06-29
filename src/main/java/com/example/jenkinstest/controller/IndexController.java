package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xukj
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hello ~~";
    }
}
