#
título da palestra

#
apresentação pessoal

#
Programação Funcional
o que é

Paradimgma de programação - considera a computação como a avaliação de funções matemáticas.
Raízes no Cálculo Lambda (30's). Primeiras linguagens funcionais (50's).

Conceitos principais:
- funções puras: uma função sempre retorna o mesmo output para o mesmo input
- funções independentes de estado e sem "side-effects"

Contribuições:

- garbage collector
- TODO


#
Programação Funcional
me vi estudando coisas como:

Conceitos difícieis e teóricos
Pure functions
First-class function
Higher-order function
Monad
Immutable data/state
Referential transparency
Currying
Composition

Linguagens estranhas, que eu não usaria no meu dia-a-dia
SML
Racket
Oz (???)
Haskell

#
Programação Funcional - Na prática

Programação Imperativa x Progamação Funcional

Programação Imperativa enfatiza os passos necessários para o programa atingir um resultado. Ex: inicializar um array vazio, inicializar um contador, percorrer um array, testar a igualdade de dois valores etc.

Programação Funcional enfatiza a disposição e uso de funções que realizam certas ações, sem explicitar os passos necessários. Ex: filtrar um array.

#
Programação Funcional - Na prática
trazendo para nossa realidade

O quê?
- ensinar a usar o **estilo de programação funcional** nas linguagens que trabalhamos no **dia-a-dia** (Javascript, Java, C#)

Por que?
- evitar código boilerplate, tornar nosso código mais **conciso** e **expressivo**, comunicar melhor nossa intenção

Como?
- através de **exemplos práticos**, ensinando a usar algumas **funções clássicas**, especialmente para **manipulação de collections**

#
First-class function

Poder usar uma função nas mesmas partes do programa onde se pode usar um outro valor qualquer (número, string etc).

- poder atribuir uma função a uma variável
- poder passar/receber uma função por parâmetro

Como Javascript e Java fazem isso
Javascript - sim
Java - não, mas dá um jeito (FunctionalInterface)

#
each
filter
find
every
some
map
reduce




# Desafios

1.
O usuário está assinando uma newsletter. Existem diversas checkboxes com assuntos que ele pode selecionar para receber. Escrever um algoritmo que percorra a lista de checkboxes ($checkboxes) e descubra se pelo menos uma delas está selecionada (usando .is(':checked')).

var someChecked = some($checkboxes, function($checkbox) {
  return $checkbox.is(':checked');
});

2.
No histórico de pedidos do usuário, teremos uma nova seção chamada "Trendy", onde são mostrados só os pedidos que contenham produtos que estão bombando nas redes socias. O sapato com o código 345 apareceu em uma foto no Instagram da Bruna Marquezine. Temos uma lista com todos os pedidos desse cliente, mas nessa seção queremos mostrar só os que tenham algum item com o produto 345.

var orders = [
  {
    number: 1,
    customer: 1,
    finished: false,
    items: [
      {
        product: 143,
        value: 9.9,
        quantity: 5
      },
      {
        product: 345,
        value: 4.35,
        quantity: 5
      }
    ]
  },
  {
    number: 2,
    customer: 5,
    finished: true,
    items: [
      {
        product: 265,
        value: 19.9,
        quantity: 4
      },
      {
        product: 778,
        value: 6.75,
        quantity: 3
      }
    ]
  }
];

var trendy = // TODO

/*
var trendy = filter(orders, function(order) {
  return some(order.items, function(item) {
    return item.product === 345;
  });
});
*/

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


3.
Estamos implementando a página de produto de um e-commerce de sapatos customizáveis. Cada modelo de sapato tem uma lista variável de tipos de características (cor, material, tamanho do salto etc). Cada tipo de característica pode ter diversos valores (cor preta, branca, vermelha etc). Queremos implementar um algoritmo que calcule o número de combinações possíveis, para colocar um banner na tela: "São X combinações possíveis para você escolher!"


var characteristics = [];
characteristics.push(['Branco', 'Preto', 'Vermelho', 'Azul']);
characteristics.push(['Sem salto', 'Salto baixo', 'Salto médio']);
characteristics.push(['Couro', 'Camurça']);

var combinations = // TODO

/*
var combinations = reduce(characteristics, function(memo, each) {
  return memo * each.length;
}, 1);
*/


4.
Temos uma lista de pedidos. Queremos obter uma lista com o valor total de cada pedido.

/*
var totals = map(orders, function(order) {
  return reduce(order.items, function(acc, item) {
    return acc + item.quantity * item.value;
  }, 0);
});
*/

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

var totals = // TODO
