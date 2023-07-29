package com.online.store.repository;

import com.online.store.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    List<Product> findByCategory(String productCategory);

    default List<Product> findAtMostNumberOfProducts(int numberOfProducts) {
        Page<Product> page = findAll(PageRequest.of(0, numberOfProducts));
        return page.toList();
    }


}
