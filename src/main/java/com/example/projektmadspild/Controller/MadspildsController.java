package com.example.projektmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MadspildsController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
