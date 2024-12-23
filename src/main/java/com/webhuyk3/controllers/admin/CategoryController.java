package com.webhuyk3.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
    @RequestMapping("admin/category")
    public String category() {
        return "admin/category";
    }

    @RequestMapping("admin/add-category")
    public String addCategory() {
        return "admin/add-category";
    }
}
