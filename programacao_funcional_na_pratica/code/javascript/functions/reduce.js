var reduce = function(list, operation, initial) {
  var accumulator = initial;
  for (var i = 0; i < list.length; i++) {
    accumulator = operation(accumulator, list[i]);
  }
  return accumulator;
};
