package com.javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HelloController {

    @RequestMapping("/say")
    public String say(Model model){
        model.addAttribute("name","wormday");
        return "say";
    }
}
