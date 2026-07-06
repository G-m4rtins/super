package com.example.demo.api.domain.stockMovement.dto;

import com.example.demo.api.domain.stockMovement.entity.MovementReason;
import com.example.demo.api.domain.stockMovement.entity.MovementType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockMovementRequest {

    @NotNull(message = "O produto é obrigatório")
    private Long productId;

    @NotNull(message = "O tipo de movimentação é obrigatório")
    private MovementType type;

    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 1, message = "A quantidade deve ser maior que 0")
    private Integer quantity;

    @NotNull(message = "O motivo é obrigatório")
    private MovementReason reason;

    private BigDecimal unitPrice;

    @NotNull(message = "O usuário responsável é obrigatório")
    private Long userId;

    private String observation;

}
