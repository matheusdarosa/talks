var each = function(list, operation) {
  for (var i = 0; i < list.length; i++) {
    operation(list[i]);
  }
};
