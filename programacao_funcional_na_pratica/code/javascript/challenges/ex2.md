2. Em um e-commerce sapatos, teremos uma nova seção no histórico de pedidos do usuário chamada "Trendy", onde são mostrados só os pedidos que contenham produtos que estão bombando nas redes socias. O sapato com o código 345 apareceu em uma foto no Instagram da Bruna Marquezine.
Temos uma lista com todos os pedidos desse cliente (`orders`), mas nessa seção queremos mostrar só os que tenham algum item com o produto 345.

Imperative style
```
var trendy = [];
for (var i = 0; i < orders.length; i++) {
  var order = orders[i];
  for (var j = 0; j < order.items.length; j++) {
    var item = order.items[j];
    if (item.product === 345) {
      trendy.push(order);
      break;
    }
  }
}
```

Functional style
```
var trendy = filter(orders, function(order) {
  return some(order.items, function(item) {
    return item.product === 345;
  });
});
```
