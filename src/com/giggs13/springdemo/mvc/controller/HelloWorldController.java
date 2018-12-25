package com.giggs13.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
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

    @RequestMapping("/process-form-v3")
    public String processFormVersion3(@RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();
        String result = "Hey My Friend " + name;
        model.addAttribute("message", result);

        return "hello-world";
    }
}
