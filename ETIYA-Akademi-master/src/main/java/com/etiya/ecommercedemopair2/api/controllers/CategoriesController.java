package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.CategoryService;
import com.etiya.ecommercedemopair2.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/getById")
    public Category getById(@RequestParam("id") int id){
        return categoryService.getById(id);
    }

    @GetMapping("/getByName")
    public Category getByName(@RequestParam("name") String name){
        return categoryService.getByName(name);
    }

    @GetMapping("/customGetByName")
    public Category customGetByName(@RequestParam("name") String name){
        return categoryService.customGetByName(name);
    }

    //client
    //server
    //DTO: Data Transfer Object
    //AddCategory: name
    @PostMapping("/add")
    public ResponseEntity<AddCategoryResponse> addCategory(@RequestBody @Valid AddCategoryRequest addCategoryRequest){
        return new ResponseEntity<>(categoryService.addCategory(addCategoryRequest), HttpStatus.CREATED);
    }
}
