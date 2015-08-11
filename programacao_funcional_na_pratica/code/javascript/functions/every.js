var every = function(list, operation) {
  for (var i = 0; i < list.length; i++) {
    if (!operation(list[i])) {
      return false;
    }
  }
  return true;
};
