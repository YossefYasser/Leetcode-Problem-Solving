/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(x, val) {
 
    let k = 0;
for (var i = 0; i < x.length; i++) {
  if (x[i] == val) {
    x[i] = "";
  } else {
    x[k] = x[i];

    if (i != k) {
      x[i] = "";
    }
    k++;
  }
}
return k;


};