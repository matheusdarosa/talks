Temos uma lista de pedidos. Queremos obter uma lista com o valor total de cada pedido.

Imperative style
```
var totals = [];
for (var i = 0; i < orders.length; i++) {
  var order = orders[i];
  var total = 0;
  for (var j = 0; j < order.items.length; j++) {
    var item = order.items[j];
    total += item.value * item.quantity;
  }
  totals.push(total);
}
```

Functional style
```
var totals = map(orders, function(order) {
  return reduce(order.items, function(acc, item) {
    return acc + item.quantity * item.value;
  }, 0);
});
```
