let array = "1 2 3 4 5".split(" ");

let newMapping = array.map(function(someElement) {
    return parseInt(someElement);
})

console.log(array);
console.log(newMapping);