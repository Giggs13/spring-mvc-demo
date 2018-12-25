package com.giggs13.springdemo.mvc.controller;

import com.giggs13.springdemo.mvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;
    @Value("#{languages}")
    private Map<String, String> languages;
    @Value("#{operatingSystems}")
    private Map<String, String> operatingSystems;

    @RequestMapping("/show-form")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countryOptions", countryOptions);
        model.addAttribute("languages", languages);
        model.addAttribute("operatingSystems", operatingSystems);

        return "student-form";
    }

    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println("The student: " + student);

        return "student-confirmation";
    }
}
