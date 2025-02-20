package com.webhuyk3.controllers.admin;

import com.webhuyk3.entitys.Category;
import com.webhuyk3.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String get(Model model) {
        List<Category> list = categoryService.getAll();
        model.addAttribute("list", list);
        return "admin/category/index";
    }

    @GetMapping("/add-category")
    public String add(Model model) {
        Category category = new Category();
        category.setCategoryStatus(true);
        model.addAttribute("category", category);
        return "admin/category/add";
    }

    @PostMapping("/add-category")
    public String save(@ModelAttribute("category") Category category) {
        if(categoryService.create(category)){
            return "redirect:/admin/category";
        }
        return "admin/category/add";
    }

    @GetMapping("/edit-category/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        Category category = categoryService.getById(id);
        model.addAttribute("category", category);
        return "admin/category/edit";
    }

    @PostMapping("/edit-category")
    public String update(@ModelAttribute("category") Category category) {
        return save(category);
    }

    @GetMapping("/delete-category/{id}")
    public String delete(@PathVariable("id") Integer id) {
        if(categoryService.delete(id)){
            return "redirect:/admin/category";
        }
        return "redirect:/admin/category";
    }
}
