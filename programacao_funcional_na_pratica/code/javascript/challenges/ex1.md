O usuário está assinando uma newsletter. Existem diversas checkboxes com assuntos que ele pode selecionar para receber. Ele deve selecionar pelo menos uma.
Escrever um algoritmo que percorra a lista de checkboxes (`$checkboxes`) e descubra se pelo menos uma delas está marcada, usando `.is(':checked')`.

Functional style
```
var someChecked = some($checkboxes, function($checkbox) {
  return $checkbox.is(':checked');
});
```
