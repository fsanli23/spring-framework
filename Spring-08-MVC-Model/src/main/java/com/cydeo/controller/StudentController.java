package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "fatih");
        model.addAttribute("course", "MVC");

        UUID randomId = UUID.randomUUID();

        model.addAttribute("studentId", randomId);

        Student student = new Student("2585258", "fatih", "sanli");

        model.addAttribute("student", student);

        return "student/welcome";
    }

    @RequestMapping("/register")
    public String registerStudent(Model model) {

        Student student0 = new Student("2585258", "fatih1", "sanli1");
        Student student1 = new Student("2585258", "fatih2", "sanli2");
        Student student2 = new Student("2585258", "fatih3", "sanli3");
        Student student3 = new Student("2585258", "fatih4", "sanli4");
        List<Student> list = new ArrayList<>(Arrays.asList(student0, student1, student2, student3));

        model.addAttribute("myList", list);

        return "student/register";
    }


}
