package com.example.shoppingcart.service;
import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.record.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    private final Basket basket;

    public ProductService(Basket basket) {
        this.basket = basket;
    }

    public Product addProductToBasket(ProductRequest productRequest) {
       return this.basket.addProductToList(productRequest);
    }

    public Collection<Product> getAllProductToBasket() {
        return this.basket.getAllProductToBasket();
    }
}
