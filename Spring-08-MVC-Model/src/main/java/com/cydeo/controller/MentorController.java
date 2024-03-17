package com.cydeo.controller;

import com.cydeo.Enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MentorController {
   @Value("city")
  String city ="dallas";

    Mentor adam = new Mentor("adam", "smith", Gender.MALE);
    Mentor bryan = new Mentor("Bryan", "Sun", Gender.MALE);
    Mentor daisy = new Mentor("Daisy", "River", Gender.FEMALE);

    List<Mentor> listOfMentor = new ArrayList<>(Arrays.asList(adam, bryan, daisy));

    @RequestMapping("/mentor")
    public String mentor(Model model) {

        model.addAttribute("mentors", listOfMentor);

        return "mentor/mentors";


    }


}
