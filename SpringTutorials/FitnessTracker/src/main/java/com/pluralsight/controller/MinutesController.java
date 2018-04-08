package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute ("ex") Exercise exercise){

        System.out.println("exercise: " + exercise.getMinutes());

        return "addMinutes"; //<-- name of JSP page that will be opened and it will put data into it. addMinutes.jsp
//        return "forward:addMoreMinutes.html
//        return "redirect:addMoreMinutes.html";
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute ("ex") Exercise exercise){
//
//        System.out.println("exercising: " + exercise.getMinutes());
//
//        return "addMinutes"; //<-- name of JSP page that will be opened and it will put data into it. addMinutes.jsp
//    }

}
