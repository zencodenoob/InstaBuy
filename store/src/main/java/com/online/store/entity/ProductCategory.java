package com.online.store.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductCategories")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String category;

    public ProductCategory() {
    }

    public ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
