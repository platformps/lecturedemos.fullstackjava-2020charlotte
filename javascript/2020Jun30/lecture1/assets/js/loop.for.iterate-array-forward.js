let someArray = [
    "The",
    "Quick",
    1,
    "Brown",
    true
];


// let counter = 0;
// while(counter < someArray.length) {
//     let currentElement = someArray[counter];
//     console.log("The current element is = " + currentElement);
//     counter++;
// }


for(let currentIndex=0; currentIndex<someArray.length; currentIndex++) {
    let currentElement = someArray[currentIndex];
    console.log(currentElement);
}