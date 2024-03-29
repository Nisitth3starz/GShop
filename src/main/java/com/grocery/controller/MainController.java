package com.grocery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        String name = "Nisith";
        model.addAttribute("text",name);
        return "login";
    }

    @GetMapping("/index")
    public String index(){
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
