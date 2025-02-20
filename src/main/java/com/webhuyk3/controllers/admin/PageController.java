package com.webhuyk3.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class PageController {

    @GetMapping("/pages")
    public String index(){
        return "admin/pages/index";
    }
}
