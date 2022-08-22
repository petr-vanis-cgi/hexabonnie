package com.cgi.hexagon.h2storage;

import com.cgi.hexagon.businessrules.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public AssemblyOrder fromOrder(Order order) {
        return new AssemblyOrder(order.getId())
                .withStatus(order.getStatus())
                .withGoodsId(order.getGoodsId())
                .withAssembler(order.getAssembler())
                .withQuantity(order.getQuantity());
    }

    public Order fromEntity(AssemblyOrder orderEntity) {
        return new Order()
                .withId(orderEntity.getId())
                .withStatus(orderEntity.getStatus())
                .withGoodsId(orderEntity.getGoodsId())
                .withAssembler(orderEntity.getAssembler())
                .withQuantity(orderEntity.getQuantity());
    }
}
