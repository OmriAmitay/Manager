package com.roomservice.notification.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.roomservice.notification.entity.OpportunityData;

@Controller
public class LoginController {

    @GetMapping("/fire")
    public String greetingForm(Model model) {
        model.addAttribute("opportunityForm", new OpportunityData());
        return "opportunityForm";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute OpportunityData opportunityData) {
        return "result";
    }

}