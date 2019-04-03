package com.zalego.io.demo.controller;

import com.zalego.io.demo.controller.DO.Login;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thyme")
public class thymeController {

    @PostMapping(value ="/java",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)

    public String ShowPage(Model model, Login login){
        System.out.println(login.getUsername());
        model.addAttribute("email",login.getUsername());
    return "java";
    }
    @GetMapping("/login")
    public String login(Model model ){

        return "login";
    }
    @GetMapping("/register")
    public String register(Model model){
        return "registration";
    }
    @GetMapping("/forgetPassword")
    public String forgetPassword(Model model){
        return "forgetPassword";
    }
    @GetMapping("/dashboard")
    public String viewDashboard(Model model) {
        return "dashboard";
    }
    @GetMapping("/add-hotel")
    public String addHotel(Model model){

        return "add-hotel";
    }
}

