var existsNotFinished = some(orders, function(order) {
  return !order.finished;
});
