package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {


    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model, @RequestParam Integer year) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println("make = " + make);
        return "car/car-info";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(required = false) String make, Model model, @RequestParam(required = false) Integer year) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println("make = " + make);
        return "car/car-info";
    }

    @RequestMapping("info3/{make}")
    public String getCarInfo(Model model, @PathVariable(required = false) String make) {

        model.addAttribute("make", make);

        return "car/car-info";

    }


}
