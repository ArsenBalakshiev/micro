package ru.scbt.baseservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/index")
    public String showUserList(Model model) {
        return "index";
    }

}
