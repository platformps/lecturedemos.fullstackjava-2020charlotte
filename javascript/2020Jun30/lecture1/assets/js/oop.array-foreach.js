let array = "1 2 3 4 5".split(" ");
function functionToExecuteForEachElement(arrayElement) {
    console.log(10 + parseInt(arrayElement));
};
array.forEach(functionToExecuteForEachElement);