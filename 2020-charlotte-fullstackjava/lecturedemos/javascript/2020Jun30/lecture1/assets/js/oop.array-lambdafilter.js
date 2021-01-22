let array = "1 2 3 4 5".split(" ");
let lambdaFilter = obj => parseInt(obj) > 2;
let filteredArray = array.filter(lambdaFilter);

console.log(array)
console.log(filteredArray);