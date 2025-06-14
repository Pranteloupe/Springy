package org.example.springy.controllers;

import org.example.springy.services.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(Model model, @RequestParam String username, @RequestParam String password) {

        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);

        boolean loggedIn  = loginProcessor.login();

        if (loggedIn) {
            return "redirect:/home";
        } else {
            model.addAttribute("message", "Login failed!");
        }

        return "login.html";
    }
}
