package com.ra.model.dao;

import com.ra.model.entity.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();

    boolean save(Category category);
    boolean update(Category category);

    Category findById(Integer id);
    void changeStatus(Integer id);
}
