package com.clone.facebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class fbController {
    @GetMapping("")

    public String show() {
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String pass, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("pass", pass);
        return "home";

    }

    @GetMapping("/signup")

    public String signup() {
        return "signup";
    }

    @PostMapping("/done")

    public String done(@RequestParam String fname, @RequestParam String lname, @RequestParam String email,
            @RequestParam String pass, @RequestParam String birthday, @RequestParam String gender, Model model) {
        model.addAttribute("Fname", fname);
        model.addAttribute("lname", lname);
        model.addAttribute("email", email);
        model.addAttribute("pass", pass);
        model.addAttribute("birthday", birthday);
        model.addAttribute("gender", gender);
        return "done";

    }
}