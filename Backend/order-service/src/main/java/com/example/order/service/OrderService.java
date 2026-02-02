package com.example.order.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.order.dto.OrderRequestDTO;
import com.example.order.dto.ProductDTO;
import com.example.order.exception.ProductNotFoundException;
import com.example.order.model.Order;
import com.example.order.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;

    private static final String PRODUCT_SERVICE_URL =
            "http://localhost:8081/api/products/";

    public OrderService(OrderRepository orderRepository,
                        RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    public Order placeOrder(OrderRequestDTO request) {

        ProductDTO product;

        try {
            product = restTemplate.getForObject(
                    PRODUCT_SERVICE_URL + request.getProductId(),
                    ProductDTO.class);
        } catch (Exception e) {
            throw new ProductNotFoundException("Product does not exist");
        }

        if (product == null ||
            product.getAvailableQuantity() < request.getQuantity()) {
            throw new ProductNotFoundException("Product not available in requested quantity");
        }

        double totalAmount =
                product.getPrice() * request.getQuantity();

        Order order = new Order(
                request.getCustomerName(),
                product.getProductId(),
                request.getQuantity(),
                totalAmount
        );

        return orderRepository.save(order);
    }
}