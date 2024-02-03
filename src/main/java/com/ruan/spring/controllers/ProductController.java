package com.ruan.spring.controllers;

import com.ruan.spring.domain.product.ProductRepository;
import com.ruan.spring.domain.product.RequestProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts(){
        var allPrducts = repository.findAll();
        return ResponseEntity.ok(allPrducts);
    }
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Validated RequestProduct data){
        System.out.println(data);
        return ResponseEntity.ok().build();
    }

}
