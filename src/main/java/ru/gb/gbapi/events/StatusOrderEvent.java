package ru.gb.gbapi.events;

import lombok.*;
import ru.gb.gbapi.common.enums.OrderStatus;
import ru.gb.gbapi.order.dto.OrderDto;

@Getter
@Setter
@NoArgsConstructor
public class StatusOrderEvent extends OrderEvent {

    private OrderStatus prevStatus;

    @Builder
    public StatusOrderEvent(OrderDto orderDto, OrderStatus prevStatus) {
        super(orderDto);
        this.prevStatus = prevStatus;
    }
}
