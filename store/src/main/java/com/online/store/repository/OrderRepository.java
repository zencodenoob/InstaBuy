package com.online.store.repository;

import com.online.store.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    <S extends Order> List<S> saveAll(Iterable<S> orders);
    List<Order> findByFirstNameAndLastName(String firstName, String lastName);

}
