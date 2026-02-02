package com.example.order.model;

import jakarta.persistence.*;
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String customerName;
    private Long productId;
    private Integer quantityOrdered;
    private Double totalAmount;

    public Order() {}

    public Order(String customerName, Long productId, Integer quantityOrdered, Double totalAmount) {
        this.customerName = customerName;
        this.productId = productId;
        this.quantityOrdered = quantityOrdered;
        this.totalAmount = totalAmount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}