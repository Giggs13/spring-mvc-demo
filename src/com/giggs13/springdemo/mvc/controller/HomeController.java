package com.giggs13.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
public class HomeController {

    @PostConstruct
    private void init() {
        System.out.println(">>> HomeController: inside init()");
    }

    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }
}
