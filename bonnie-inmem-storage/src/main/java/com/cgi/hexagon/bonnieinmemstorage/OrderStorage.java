package com.cgi.hexagon.bonnieinmemstorage;

import com.cgi.hexagon.businessrules.Order;
import com.cgi.hexagon.businessrules.OrderLoader;
import com.cgi.hexagon.businessrules.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrderStorage implements OrderLoader {

    SomeBean someBean;

    @Autowired
    public OrderStorage(SomeBean someBean) {
        this.someBean = someBean;
    }

    private final Map<Long, Order> orders = Map.of(
            1L, new Order().withId(1L).withGoodsId("kit1fromInMemStorage").withStatus(Status.NEW),
            2L, new Order().withId(2L).withGoodsId("kit1fromInMemStorage").withStatus(Status.CLAIMED),
            3L, new Order().withId(3L).withGoodsId("kit1fromInMemStorage").withStatus(Status.SHIPPED)
    );

    @Override
    public Order load(long id) {
        someBean.doWrite("" + id);
        return orders.get(id);
    }
}
