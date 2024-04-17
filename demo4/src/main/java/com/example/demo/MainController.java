package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {

    @RequestMapping("/")
    public String mainMethod(){
        System.out.println("main handler 발동");
        return "main";
    }
}
