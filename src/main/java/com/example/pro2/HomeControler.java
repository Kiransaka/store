package com.example.pro2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
    @RequestMapping("/")
    public String Index(){
        return "index.html";
    }
}
