package com.online.store.entity;

import java.util.Collections;
import java.util.List;

public class ProductsWrapper {
    private List<Product> products = Collections.EMPTY_LIST;

    public ProductsWrapper(List<Product> products) {
        this.products = Collections.unmodifiableList(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}
