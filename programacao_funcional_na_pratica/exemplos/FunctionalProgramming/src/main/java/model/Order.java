package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by rafael on 8/6/15.
 */
@Getter
@Setter
public class Order {

    public Order(Integer number, Integer customer, Boolean finished, List<OrderItem> items) {
        this.number = number;
        this.customer = customer;
        this.finished = finished;
        this.items = items;
    }

    private Integer number;
    private Integer customer;
    private Boolean finished;
    private List<OrderItem> items;
}