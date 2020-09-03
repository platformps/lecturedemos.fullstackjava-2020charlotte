let array = "1 2 3 4 5".split(" ");
let splicedArray = array.splice(0, 3); // idempotent operation; factory method
console.log(splicedArray);