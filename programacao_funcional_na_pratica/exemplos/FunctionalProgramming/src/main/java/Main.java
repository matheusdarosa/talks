import model.Order;
import model.OrderItem;
import service.OrderService;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by rafael on 8/6/15.
 */
public class Main {

    private static OrderService orderService = new OrderService();
    private static List<Order> orders;

    static {
      orders = orderService.getOrders();
    }

    public static void main(String[] args) {
        each();
        filter();
        find();
        every();
        some();
        map();
        reduce();
    }

    private static void each() {

        orders.stream()
                .forEach((o) -> o.setFinished(true));

        // under the hood
        Consumer<Order> consumer = new Consumer<Order>() {
            @Override
            public void accept(Order order) {
                order.setFinished(true);
            }
        };

        orders.stream()
                .forEach(consumer);
    }

    private static void filter() {

        List<Order> ordersCustomer1 = orders.stream()
                .filter(o -> o.getCustomer() == 1)
                .collect(Collectors.toList());

        // under the hood
        Predicate<Order> predicate = new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return order.getCustomer() == 1;
            }
        };

        ordersCustomer1 = orders.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private static void find() {
        Order order2 = orders.stream()
                .filter(o -> o.getNumber() == 2)
                .findFirst().get();
    }

    private static void some() {
        Boolean existsNotFinished = orders.stream()
                .anyMatch(o -> !o.getFinished());

        // under the hood
        Predicate<Order> predicate = new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return !order.getFinished();
            }
        };

        existsNotFinished = orders.stream()
                .anyMatch(o -> !o.getFinished());
    }

    private static void every() {
        Boolean allFinished  = orders.stream()
                .allMatch(o -> o.getFinished());

        // under the hood
        Predicate<Order> predicate = new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return order.getFinished();
            }
        };

        allFinished  = orders.stream()
                .allMatch(o -> o.getFinished());
    }

    private static void map() {
        List<Integer> orderNumbers = orders.stream()
                .map(o -> o.getNumber())
                .collect(Collectors.toList());

        // under the hood
        Function<Order, Integer> function = new Function<Order, Integer>() {
            @Override
            public Integer apply(Order order) {
                return order.getNumber();
            }
        };

        orderNumbers = orders.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    private static void reduce() {
        Double orderTotal = orders.get(0).getItems().stream()
                .map(i -> i.getValue() * i.getQuantity())
                .reduce(0.0, (v1, v2) -> v1 + v2);

        // under the hood
        Function<OrderItem, Double> function = new Function<OrderItem, Double>() {
            @Override
            public Double apply(OrderItem orderItem) {
                return orderItem.getValue() * orderItem.getQuantity();
            }
        };

        BinaryOperator<Double> binaryOperator = new BinaryOperator<Double>() {
            @Override
            public Double apply(Double aDouble, Double aDouble2) {
                return aDouble + aDouble2;
            }
        };

        orderTotal = orders.get(0).getItems().stream()
                .map(function)
                .reduce(0.0, binaryOperator);
    }

}
