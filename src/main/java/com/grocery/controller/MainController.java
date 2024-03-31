package com.grocery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(Model model){
        String name = "Welcome Our Service";
        model.addAttribute("Greeting",name);
        return "index";
    }

    @GetMapping("/shopdetail")
    public String shopdetail(){
        return "product";
    }

    @GetMapping("/shopcomplete")
    public String shopcomplete(){
        return "shopcomplete";
    }

    @GetMapping("/store")
    public String store(){
        return "store";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

}
