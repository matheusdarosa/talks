package model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by rafael on 8/6/15.
 */
@Getter
@Setter
public class OrderItem {

    public OrderItem(Integer product, Double value, Integer quantity) {
        this.product = product;
        this.value = value;
        this.quantity = quantity;
    }

    private Integer product;
    private Double value;
    private Integer quantity;

}
