package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.CategoryService;
import com.etiya.ecommercedemopair2.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Category;
import com.etiya.ecommercedemopair2.repository.abstracts.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }

    @Override
    public Category getByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Category customGetByName(String name) {
        return categoryRepository.customFindByName(name);
    }

    @Override
    public AddCategoryResponse addCategory(AddCategoryRequest addCategoryRequest) {
        Category category = new Category();
        category.setName(addCategoryRequest.getName());
        Category savedCategory = categoryRepository.save(category);

        AddCategoryResponse response = new AddCategoryResponse(savedCategory.getId(), savedCategory.getName());
        return response;
    }
}