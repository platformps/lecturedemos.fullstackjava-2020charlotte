let threeIsGreaterThanTwoAndSixIsEqualToSix = 3 > 2 && 6 ==6;
let threeIsGreaterThanTwoAndSixIsEqualToSeven = 3 > 2 && 6 == 7;

let threeIsGreaterThanTwoOrSixIsEqualToSix = 3 > 2 || 6 == 6;
let threeIsGreaterThanTwoOrSixIsEqualToSeven = 3 > 2 || 6 == 7;
let threeIsLessThanTwoOrSixIsNotEqualToSix = 3 < 2 || 6 != 5;

let notThreeIsLessThanTwoOrSixIsNotEqualToSix = !( 3 < 2 || 6 != 6);
let notThreeIsGreaterThanTwoAndSixIsEqualToSix = !( 3>2 && 6==6);

let someStringValue = "jump";


// console.log("Hello world");
console.log("threeIsGreaterThanTwoAndSixIsEqualToSix = " + threeIsGreaterThanTwoAndSixIsEqualToSix);
console.log("threeIsGreaterThanTwoAndSixIsEqualToSeven = " + threeIsGreaterThanTwoAndSixIsEqualToSeven);
console.log("threeIsGreaterThanTwoOrSixIsEqualToSix = " + threeIsGreaterThanTwoOrSixIsEqualToSix);
console.log("threeIsGreaterThanTwoOrSixIsEqualToSeven = " + threeIsGreaterThanTwoOrSixIsEqualToSeven);
console.log("threeIsLessThanTwoOrSixIsNotEqualToSix = " + threeIsLessThanTwoOrSixIsNotEqualToSix);
console.log("notThreeIsLessThanTwoOrSixIsNotEqualToSix = " + notThreeIsLessThanTwoOrSixIsNotEqualToSix);
console.log("notThreeIsGreaterThanTwoAndSixIsEqualToSix = " + notThreeIsGreaterThanTwoAndSixIsEqualToSix);


if(threeIsGreaterThanTwoAndSixIsEqualToSeven) {
    console.log("It is true");
} else if(!threeIsGreaterThanTwoAndSixIsEqualToSeven && notThreeIsGreaterThanTwoAndSixIsEqualToSix) {
    console.log("It is false");
} else {
    console.log("everything is false; the world is a lie");
}

switch(someStringValue) {
    case "run":
        console.log("The person is running");
        break;

    case "jump":
        console.log("The person is jumping");
        break;

    case "program":
        console.log("The person is programming");
        break;
    
    case "type":
        console.log("The person is typing");
        break;
    
    default:
        console.log("Not matched cases!");
        break;
}


if(someStringValue == "run") {
    console.log("The person is running");
} else if(someStringValue == "jump") {
    console.log("The person is jumping");
} else if(someStringValue == "program") {
    console.log("The person is programming");
} else if(someStringValue == "type") {
    console.log("The person is typing");
} else {
    console.log("Not matched cases!");
}



let someString = "5";
let someOther = someString + 5; // "55"
let someOther1 = parseInt(someString) + 5; // 10
let another = someString - 2; // 3


// This is an example of a single-line comment
// output of these `console.log` will be
// `true`
// `false`
// `true`
// `true`
// `true`
// `true`
// `false`



/*
This is an example of a multi-line comment
output of these `console.log` will be
`true`
 `false`
 `true`
 `true`
 `true`
 `true`
 `false`
*/
