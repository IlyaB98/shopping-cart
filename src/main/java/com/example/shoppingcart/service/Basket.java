package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.record.ProductRequest;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class Basket {

    private final List<Product> productList = new ArrayList<>();

    public Product addProductToList(ProductRequest productRequest) {
        if (productRequest.getId() < 0) {
            throw new IllegalArgumentException("Id продукта не может быть отрицательная!");
        } else {
            Product product = new Product(productRequest.getId());
            productList.add(product);
            return product;
        }
    }

    public Collection<Product> getAllProductToBasket() {
        return productList.stream().toList();
    }
}
