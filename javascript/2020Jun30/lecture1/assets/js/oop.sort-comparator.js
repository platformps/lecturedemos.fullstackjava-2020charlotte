let array = ["~", "`", "the", "The", "Quick", 33, 4, 1111, 222];
array.sort(); // default sorting; lexigraphical order
console.log("Printing lexigraphical order of array\n\t" + array);

// custom sorting; numerical order
array.sort(function(baseValue,valueToSubtractFromBase) {
    // if difference is greater than 0, then `baseValue` is greater than `valueToSubtractFromBase`
    // if difference is less than 0, then `baseValue` is less than `valueToSubtractFromBase`
    // if difference is 0, then `baseValue` is equal to `valueToSubtractFromBase`
    let difference = baseValue - valueToSubtractFromBase;
    return difference;
});

console.log("Printing numerical order of array\n\t" + array);