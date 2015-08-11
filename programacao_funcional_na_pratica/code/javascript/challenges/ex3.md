Estamos implementando a página de produto de um e-commerce de sapatos customizáveis. Cada modelo de sapato tem uma lista variável de tipos de características (cor, material, tamanho do salto etc) na variável `characteristics`. Cada tipo de característica pode ter diversos valores (cor preta, branca, vermelha etc).
Queremos implementar um algoritmo que calcule o número de combinações possíveis, para colocar um banner na tela: "São X combinações possíveis para você escolher!”.

Imperative style
```
var combinations = 1;
for (var i = 0; i < characteristics.length; i++) {
  combinations *= characteristics[i].length;
}
```

Functional style
```
var combinations = reduce(characteristics, function(memo, each) {
  return memo * each.length;
}, 1);
```
