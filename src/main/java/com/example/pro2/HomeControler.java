package com.example.pro2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
    @Value("${spring.application.name}")
    private String appName;
    @RequestMapping("/")
    public String Index(){
        System.out.println("app name:- "+appName );
        OrderService product = new OrderService();
        product.order();
        return "index.html";
    }
}
