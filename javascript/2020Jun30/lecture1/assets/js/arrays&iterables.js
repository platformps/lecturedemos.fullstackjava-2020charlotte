
// array declaration
let someArray = [
    ["The", "Quick", "Brown"],
    100,
    1500,
    "What about now? Am I the last one?",
    "What about now?  the last one?",
    "What about now? Am I last one?",
    "What about now? Am I the one?",
 ];
 
 someArray.push("This element");
 
 
 someArray[2] = "Some other value";
 delete someArray[2];
 
 let firstElement = someArray[0]; // The,Quick,Brown
 let thirdElementOfFirstElement = firstElement[2]; // Brown
 let secondElement = someArray[1]; // 100
 let thirdElement = someArray[2]; // 1500
 let fourthElement = someArray[3]; // undefined
 let fifthElement = someArray[4]; // undefined
 
 let lengthOfArray = someArray.length;
 let lastElement = someArray[lengthOfArray-1]
 
 let multiplier = someArray[2] * 10;
 
 someArray[1] = "Why doesn't this print?!";
 
 // console.log("The first element of the array is = " + firstElement);
 // console.log("The second element of the array is = " + secondElement);
 // console.log("The third element of the array is = " + thirdElement);
 // console.log("The last element of the array is = " + lastElement);
 console.log(someArray);
 console.log(someArray[2]);