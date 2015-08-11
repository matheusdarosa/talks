var some = function(list, operation) {
  for (var i = 0; i < list.length; i++) {
    if (operation(list[i])) {
      return true;
    }
  }
  return false;
}
