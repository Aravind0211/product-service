package dev.dberenguer.dapr.product.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {
    private UUID id;
    private String code;
    private String name;
    private Double price;
}
