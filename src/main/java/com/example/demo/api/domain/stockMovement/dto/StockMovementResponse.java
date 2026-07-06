package com.example.demo.api.domain.stockMovement.dto;

import com.example.demo.api.domain.stockMovement.entity.MovementReason;
import com.example.demo.api.domain.stockMovement.entity.MovementType;
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
public class StockMovementResponse {
    private Long id;
    private Long productId;
    private MovementType type;
    private Integer quantity;
    private MovementReason reason;
    private BigDecimal unitPrice;
    private LocalDateTime movedAt;
    private Long userId;
    private String observation;
}
