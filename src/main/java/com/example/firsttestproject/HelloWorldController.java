package com.example.firsttestproject;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/show-form")
    public String showForm(){
        return "helloWorld-form";
    }

    @RequestMapping("/process-form")
    public String processForm(){
        return "helloWorld";
    }

    @RequestMapping("/process-form-two")
    public String newMethod(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String newName = name + " Yooooo";

        model.addAttribute("meessage", newName);
        return "helloWorld";
    }

    @RequestMapping("/process-form-three")
    public String newMethodNew(@RequestParam("studentName") String name, Model model){
//        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String newName = name + " MaiMaiMai";

        model.addAttribute("meessage", newName);
        return "helloWorld";
    }
}
