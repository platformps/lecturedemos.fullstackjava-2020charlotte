let array = "1 2 3 4 5".split(" ");
let filteredArray = array.filter(function(object) {
    if(parseInt(object) > 2) {
        return true;
    } else {
        return false;
    }
})

console.log(array)
console.log(filteredArray);