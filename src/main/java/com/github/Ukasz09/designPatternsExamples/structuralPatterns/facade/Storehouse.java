package com.github.Ukasz09.designPatternsExamples.structuralPatterns.facade;

import java.util.HashMap;

public class Storehouse {
    private HashMap<String, Item> items;

    //----------------------------------------------------------------------------------------------------------------//
    public Storehouse(HashMap<String, Item> items) {
        this.items = items;
    }

    public Storehouse() {
        this.items = new HashMap<>();
    }

    //----------------------------------------------------------------------------------------------------------------//
    public void printAvailableItemsList() {
        System.out.println(items);
    }

    public void addToStorehouse(Item item) {
        items.put(item.getId(), item);
    }

    public void removeFromStorehouse(Item item) {
        items.remove(item);
    }

    public Item getItem(String id) {
        return items.get(id);
    }
}
