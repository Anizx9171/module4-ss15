package com.ra.model.service;

import com.ra.model.dao.CategoryDao;
import com.ra.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryDao categoryDao;
    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public boolean save(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public boolean update(Category category) {
        return categoryDao.update(category);
    }

    @Override
    public Category findById(Integer id) {
        return categoryDao.findById(id);
    }

    @Override
    public void changeStatus(Integer id) {
    categoryDao.changeStatus(id);
    }
}
