package com.webhuyk3.services.impl;

import com.webhuyk3.entitys.Category;
import com.webhuyk3.repositorys.CategoryRepository;
import com.webhuyk3.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Boolean create(Category category) {
        try {
            categoryRepository.save(category);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Boolean update(Category category) {
        return create(category);
    }

    @Override
    public Boolean delete(int id) {
        try {
            categoryRepository.delete(getById(id));
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
