package com.webhuyk3.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String index() {
        return "redirect:/admin/";
    }

    @RequestMapping("/")
    public String admin() {
        return "admin/index";
    }
}
