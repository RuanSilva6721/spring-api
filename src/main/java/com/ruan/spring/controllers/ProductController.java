package com.ruan.spring.controllers;

import com.ruan.spring.domain.product.Product;
import com.ruan.spring.repositories.ProductRepository;
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

        Product newProduct = new Product(data);
        repository.save(newProduct);
        System.out.println(data);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable Long id, @RequestBody @Validated RequestProduct data) {

        Product product = repository.getReferenceById(id.intValue());
        product.setName(data.name());
        product.setPrice_in_cents(data.price_in_cents());
        repository.save(product);

        return ResponseEntity.ok(data);
    }

}
