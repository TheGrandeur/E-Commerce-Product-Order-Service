package com.example.order.dto;

public class OrderRequestDTO {

    private String customerName;
    private Long productId;
    private Integer quantity;

    public String getCustomerName() {
        return customerName;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}