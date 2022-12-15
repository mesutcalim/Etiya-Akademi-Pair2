package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.CategoryService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"categories")
@AllArgsConstructor
public class CategoriesController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getAll")
    public DataResult<List<Category>> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<Category> getById(@RequestParam("id") int id){
        return categoryService.getById(id);
    }

    @GetMapping("/getByName")
    public DataResult<Category> getByName(@RequestParam("name") String name){
        return categoryService.getByName(name);
    }

    @GetMapping("/customGetByName")
    public DataResult<Category> customGetByName(@RequestParam("name") String name){
        return categoryService.customGetByName(name);
    }

    //client
    //server
    //DTO: Data Transfer Object
    //AddCategory: name
//    @PostMapping("/add")
//    public ResponseEntity<AddCategoryResponse> addCategory(@RequestBody @Valid AddCategoryRequest addCategoryRequest){
//        return new ResponseEntity<>(categoryService.getData().addCategory(addCategoryRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddCategoryResponse> addCategory(@RequestBody @Valid AddCategoryRequest addCategoryRequest){
        return new DataResult<AddCategoryResponse>(categoryService.addCategory(addCategoryRequest).getData(),true,"Başarılı") ;

    }
}
