package com.webhuyk3.services;

import com.webhuyk3.entitys.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Boolean create(Category category);
    Category getById(int id);
    Boolean update(Category category);
    Boolean delete(int id);
}
