package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.ProductService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.product.AddProductRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.product.AddProductResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.Result;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"products")
public class ProductController {
    // DEPENDENCY INJECTION

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(){
        return productService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<Product> getById(@PathVariable int id){
        return productService.getById(id);
    }

    @GetMapping("/getById")
    public DataResult<Product> getByIdPath(@RequestParam("id") int id){
        return productService.getById(id);
    }

    @GetMapping("/getByStockGreaterThanOrderByStockDesc")
    public DataResult<List<Product>> getAllByStock(@RequestParam("stock") int stock){
        return productService.getAllProductsByStockGreaterThanOrderByStockDesc(stock);
    }

    @GetMapping("/getByName")
    public DataResult<Product> getByName(@RequestParam("name") String name){
        return productService.getByName(name);
    }

//    @PostMapping("/addProduct")
//    public ResponseEntity<AddProductResponse> addProduct (@RequestBody @Valid AddProductRequest addProductRequest){
//        return new ResponseEntity<AddProductResponse>(productService.addProduct(addProductRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/addResult")
    public DataResult<AddProductResponse> add(@RequestBody @Valid AddProductRequest addProductRequest){
        return new SuccessDataResult<AddProductResponse>(productService.addProduct(addProductRequest).getData(),"ssss");
    }

    @GetMapping("/getProductById")
    public DataResult<List<AddProductResponse>> getProductById(@RequestParam("id") int identity){
        return productService.getProductById(identity);
    }

//    @GetMapping("/denemeQuery")
//    public List<AddProductResponse> denemeQuery(@RequestParam("id") int identity){
//        return productService.denemeQuery(identity);
//    }
}


