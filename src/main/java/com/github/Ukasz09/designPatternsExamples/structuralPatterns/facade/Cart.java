package com.github.Ukasz09.designPatternsExamples.structuralPatterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemsInCart;

    //----------------------------------------------------------------------//
    public Cart() {
        itemsInCart = new ArrayList<>();
    }

    //----------------------------------------------------------------------//
    public void addToCart(Item item) {
        itemsInCart.add(item);
    }

    public boolean removeFromCart(Item item) {
        return itemsInCart.remove(item);
    }

    public void printItemsInCartList() {
        System.out.println(itemsInCart);
    }
}
