var map = function(list, operation) {
  var results = [];
  for (var i = 0; i < list.length; i++) {
    results.push(operation(list[i]));
  }
  return results;
};
