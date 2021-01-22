class Person {
    constructor(firstName, lastName, favoriteColors) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteColors = favoriteColors;
    }
}

class Animal {
    constructor(name, genus) {
        this.name = name;
        this.genus = genus;
    }
}


function printPersonDetails(whateverWeWant) {
    console.log("The first name is: " + whateverWeWant.firstName);
    console.log("The last name is: " + whateverWeWant.lastName);
    console.log("The favorite color is: " + whateverWeWant.favoriteColors);
}

function printDetailsPersonAndAnimal(somePerson, someAnimal) {
    printPersonDetails(somePerson);
    console.log(someAnimal.name);
    console.log(someAnimal.genus);
}

function printObjectDetailsAsKeyAndValue(someObject) {
    for(var someField in someObject) {
        console.log(someField); // field
        console.log(someObject[someField]); // field-value
    }
}



let leon = new Person("Leon", "Hunter", ["Green", "Blue", "Gray"])
leon.firstName = "Chris";

let haseeb = new Person("Haseeb", "Muhammad", ["Red", "Orange", "Blue"])
let milo = new Animal("Milo", "Canine");

// printPersonDetails(leon);
// printPersonDetails(haseeb);
// printPersonDetails(["The", "Quick", "Brown", "Fox"]);


printDetailsPersonAndAnimal(leon, milo);

