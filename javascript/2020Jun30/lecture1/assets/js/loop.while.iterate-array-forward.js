let someArray = [
    "The",
    "Quick",
    1,
    "Brown",
    true
];


let counter = 0;
let lengthOfArray =  someArray.length;
while(counter < lengthOfArray) {
    let currentElement = someArray[counter];
    console.log("The current element is = " + currentElement);
    counter++;
}