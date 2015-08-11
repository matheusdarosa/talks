import model.Order;

import java.util.function.Consumer;

/**
 * Created by rafael on 8/11/15.
 */
public class ConsumerImpl implements Consumer<Order> {
    @Override
    public void accept(Order order) {
        order.setFinished(true);
    }
}
