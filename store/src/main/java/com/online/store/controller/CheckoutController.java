package com.online.store.controller;

import com.online.store.entity.CheckoutRequest;
import com.online.store.entity.Order;
import com.online.store.service.OrdersService;
import com.online.store.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class CheckoutController {
    private final OrdersService ordersService;

    private final ProductService productsService;
    public CheckoutController(OrdersService ordersService,
                              ProductService productsService) {
        this.ordersService = ordersService;
        this.productsService = productsService;
    }

    @PostMapping("/checkout")
    public String checkout(@RequestBody CheckoutRequest checkoutRequest) {
        Set<Order> orders = new HashSet<>(checkoutRequest.getProducts().size());

        for (CheckoutRequest.ProductInfo productInfo : checkoutRequest.getProducts()) {

            Order order = new Order(checkoutRequest.getFirstName(),
                    checkoutRequest.getLastName(),
                    checkoutRequest.getEmail(),
                    checkoutRequest.getShippingAddress(),
                    productInfo.getQuantity(),
                    productsService.getProductById(productInfo.getProductId()),
                    checkoutRequest.getCreditCard());
            orders.add(order);
        }
        ordersService.placeOrders(orders);
        return "success";
    }
}
