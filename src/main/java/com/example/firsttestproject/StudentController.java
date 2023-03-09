package com.example.firsttestproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/show-form")
    public String showForm(Model model){
        Student student = new Student();

        model.addAttribute("student", student);
        return "student-form";
    }
    
    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student") Student student){
        return "student-confirmation";
    }
}
