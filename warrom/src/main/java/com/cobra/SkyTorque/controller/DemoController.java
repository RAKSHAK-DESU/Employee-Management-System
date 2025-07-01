package com.cobra.SkyTorque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/demo")
    public String greet(){
        return "Hello";
    }
    @RequestMapping(value = {"/home","/"})
    public String home(){
        return "home";
    }
}
