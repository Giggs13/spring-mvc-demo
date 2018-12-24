package com.giggs13.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "hello-world-form";
    }
}
