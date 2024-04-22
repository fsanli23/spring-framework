package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.UUID;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name","fatih");
        model.addAttribute("course","MVC");

        UUID randomId = UUID.randomUUID();

        model.addAttribute("studentId",randomId);

        Student student = new Student("2585258","fatih","sanli");

        model.addAttribute("student",student);

        return "student/welcome";
    }
}
