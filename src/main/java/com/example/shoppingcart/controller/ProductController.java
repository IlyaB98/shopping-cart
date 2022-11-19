package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.record.ProductRequest;
import com.example.shoppingcart.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/store/order/add")
    public Product addProductToBasket(@RequestBody ProductRequest productRequest) {
        return this.productService.addProductToBasket(productRequest);
    }

    @GetMapping("/store/order/get")
    public Collection<Product> getAllProductToBasket() {
        return this.productService.getAllProductToBasket();
    }
}
