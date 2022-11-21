package com.example.shoppingcart.service;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
@SessionScope
public class Basket {

    private final List<Integer> ids = new ArrayList<>();

    public Integer addIdToList(Integer id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id продукта не может быть отрицательная!");
        } else {
            ids.add(id);
            System.out.print("Добавен в корзину id - ");
            return id;
        }
    }

    public Collection<Integer> getAllIdsToBasket() {
        return ids;
    }
}
