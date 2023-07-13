package com.codehustler.backendserver.controller;

import com.codehustler.backendserver.entity.Product;
import com.codehustler.backendserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok().body(productService.findAll());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        return ResponseEntity.ok().body(productService.getReferenceById(id));
    }

    /*@PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(this.productService.saveAndFlush(product));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {
        product.setId(id);
        return ResponseEntity.ok().body(this.productService.saveAndFlush(product));
    }

    @DeleteMapping("/products/{id}")
    public HttpStatus deleteProduct(@PathVariable long id) {
        this.productService.deleteAllByIdInBatch(Arrays.asList(id));
        return HttpStatus.OK;
    }*/
}
