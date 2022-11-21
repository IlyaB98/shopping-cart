package com.example.shoppingcart.controller;

import com.example.shoppingcart.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping ("/store/order/add")
    public Integer addIdToBasket(@RequestParam("id") Integer id) {
        return this.productService.addIdToBasket(id);
    }

    @GetMapping("/store/order/get")
    public Collection<Integer> getAllIdsToBasket() {
        return this.productService.getAllIdsToBasket();
    }
}
