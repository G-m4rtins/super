package com.example.demo.api.domain.product.dto;

import com.example.demo.api.domain.product.entity.Unit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private String sku;
    private Long categoryId;
    private Long supplierId;
    private Unit unit;
    private BigDecimal costPrice;
    private BigDecimal salePrice;
    private Integer minStock;
    private Integer currentStock;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
