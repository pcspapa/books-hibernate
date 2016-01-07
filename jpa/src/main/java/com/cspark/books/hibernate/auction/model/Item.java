package com.cspark.books.hibernate.auction.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cspark on 2016. 1. 7..
 */
public class Item {

    private String name;

    private String description;

    private Set<Category> categories = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        if (category == null)
            throw new IllegalArgumentException("Null category");

        category.getItems().add(this);
        categories.add(category);
    }

}
