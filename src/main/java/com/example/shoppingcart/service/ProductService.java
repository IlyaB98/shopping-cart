package com.example.shoppingcart.service;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    private final Basket basket;

    public ProductService(Basket basket) {
        this.basket = basket;
    }

    public Integer addIdToBasket(Integer id) {
       return this.basket.addIdToList(id);
    }

    public Collection<Integer> getAllIdsToBasket() {
        return this.basket.getAllIdsToBasket();
    }
}
