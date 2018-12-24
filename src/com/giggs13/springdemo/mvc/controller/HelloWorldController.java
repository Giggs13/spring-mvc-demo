package com.giggs13.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "hello-world-form";
    }

    @RequestMapping("/process-form")
    public String processForm(Model model) {
        model.asMap()
                .forEach((key, value) -> System.out.println(key + " -> " + value));
        return "hello-world";
    }

    @RequestMapping("/process-form-v2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Yo! " + name;
        model.addAttribute("message", result);

        return "hello-world";
    }
}
