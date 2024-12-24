package com.webhuyk3.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/logon")
    public String login() {
        return "admin/logon";
    }
}
