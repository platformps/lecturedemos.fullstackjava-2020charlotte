let endingValue = 100;
for(let someValue = 0; someValue< endingValue; someValue++) {
    let someValueIsDivisibleBy2 = someValue % 2 == 0;
    let someValueIsDivisibleBy3 = someValue % 3 == 0;
    let someValueIsDivisibleBy5 = someValue % 5 == 0;
    let someValueIsDivisibleBy3And5 = someValueIsDivisibleBy3 && someValueIsDivisibleBy5; 

    if(someValueIsDivisibleBy2) {
        console.log("The value is even!")
    }

    if(someValueIsDivisibleBy3) {
        console.log("The value is divisible by 3");
    }

    if(someValueIsDivisibleBy5) {
        console.log("The value is divisible by 5");
    }


    if(someValueIsDivisibleBy3And5) {
        console.log("The value is divisible by 3 and 5")
    }
}