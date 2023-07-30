package com.online.store.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotNull(message = "First Name missing")
    private String firstName;

    @NotNull(message = "Last name missing")
    private String lastName;
    @Email(message = "Invalid email address")
    private String email;
    @NotNull(message = "Invalid Shipping Address")
    private String shippingAddress;

    @Range(min = '1', max = '5')
    private long quantity;

    @NotNull(message = "Invalid credit card details")
    private String creditCard;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public Order() {
    }

    public Order(String firstName, String lastName, String email, String shippingAddress, long quantity, Product product, String creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.quantity = quantity;
        this.product = product;
        this.creditCard = creditCard;
    }

    public Long getId() {
        return id;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    public String getShippingAddress() {
        return shippingAddress;
    }

    public Product getProduct() {
        return product;
    }

    public String getCreditCard() {
        return creditCard;
    }
}
