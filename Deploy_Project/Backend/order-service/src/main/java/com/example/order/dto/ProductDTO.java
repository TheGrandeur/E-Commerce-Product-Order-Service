package com.example.order.dto;

public class ProductDTO {

    private Long productId;
    private String productName;
    private Double price;
    private Integer availableQuantity;

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }
}