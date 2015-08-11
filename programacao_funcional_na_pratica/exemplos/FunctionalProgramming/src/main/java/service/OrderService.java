package service;

import model.Order;
import model.OrderItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 8/6/15.
 */
public class OrderService {

    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<Order>();
        List<OrderItem> items;

        items = new ArrayList<OrderItem>();
        items.add(new OrderItem(143, 9.9, 5));
        items.add(new OrderItem(345, 4.35, 5));
        orders.add(new Order(1, 1, false, items));

        items = new ArrayList<OrderItem>();
        items.add(new OrderItem(265, 19.9, 4));
        items.add(new OrderItem(778, 6.75, 3));
        orders.add(new Order(2, 5, true, items));

        return orders;
    }
}
