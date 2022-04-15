package ru.gb.gbapi.order.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gb.gbapi.common.enums.OrderStatus;
import ru.gb.gbapi.product.dto.ProductDto;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private Long id;
    private String address;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    private String phone;
    @Email
    private String mail;
    private OrderStatus status;
    @FutureOrPresent
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate deliveryDate;
    @NotEmpty
    private Set<ProductDto> products;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
