package com.online.store.service;

import com.online.store.entity.Product;
import com.online.store.repository.ProductCategoryRepository;
import com.online.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<String> getAllSupportedCategories() {
        return productCategoryRepository.findAll()
                .stream()
                .map(productCategory -> productCategory.getCategory())
                .collect(Collectors.toList());
    }
    public List<Product> getDealsOfTheDay(int atMostNumberOfProducts) {
        return productRepository.findAtMostNumberOfProducts(atMostNumberOfProducts);
    }
    public List<Product> getProductsByCategory(String productCategory) {
        return productRepository.findByCategory(productCategory);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(String.format("Product with id %s doesn't exist", id)));
    }

}

