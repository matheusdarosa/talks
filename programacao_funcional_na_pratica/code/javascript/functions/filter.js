var filter = function(list, operation) {
  var results = []
  for (var i = 0; i < list.length; i++) {
    if (operation(list[i])) {
      results.push(list[i]);
    }
  }
  return results;
};
