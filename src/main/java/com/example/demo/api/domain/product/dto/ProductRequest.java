package com.example.demo.api.domain.product.dto;

import com.example.demo.api.domain.product.entity.Unit;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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
public class ProductRequest {

    @NotBlank(message = "O nome é obrigatório")
    private String name;

    @NotBlank(message = "O SKU/código de barras é obrigatório")
    private String sku;

    @NotNull(message = "A categoria é obrigatória")
    private Long categoryId;

    @NotNull(message = "O fornecedor é obrigatório")
    private Long supplierId;

    @NotNull(message = "A unidade é obrigatória")
    private Unit unit;

    @NotNull(message = "O preço de custo é obrigatório")
    @Min(value = 0, message = "O preço de custo não pode ser negativo")
    private BigDecimal costPrice;

    @NotNull(message = "O preço de venda é obrigatório")
    @Min(value = 0, message = "O preço de venda não pode ser negativo")
    private BigDecimal salePrice;

    @NotNull(message = "O estoque mínimo é obrigatório")
    @Min(value = 0, message = "O estoque mínimo não pode ser negativo")
    private Integer minStock;

}
