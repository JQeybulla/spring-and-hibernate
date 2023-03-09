package com.example.firsttestproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
    @RequestMapping("show-form")
    public String displayForm(){
        return "silly";
    }
}
