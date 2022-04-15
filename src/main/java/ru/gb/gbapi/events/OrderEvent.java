package ru.gb.gbapi.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.gb.gbapi.order.dto.OrderDto;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent implements Serializable {

    static final long serialVersionUID = 6391714450305783092L;

    private OrderDto orderDto;
}
