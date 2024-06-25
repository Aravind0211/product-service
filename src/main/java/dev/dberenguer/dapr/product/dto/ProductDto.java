package dev.dberenguer.dapr.product.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductDto {
    String code;
    String name;
    Double price;
}
