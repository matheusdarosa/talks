var allFinished = every(orders, function(order) {
  return order.finished;
});
