var orderTotal = reduce(orders[0].items, function(acc, item) {
  return acc + (item.value * item.quantity);
}, 0);
