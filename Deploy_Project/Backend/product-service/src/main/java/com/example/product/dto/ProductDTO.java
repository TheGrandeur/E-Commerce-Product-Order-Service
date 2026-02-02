package com.example.product.dto;

public class ProductDTO {

    private Long productId;
    private String productName;
    private Double price;
    private Integer availableQuantity;

    public ProductDTO() {
    }

    public ProductDTO(Long productId, String productName, Double price, Integer availableQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}