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


printObjectDetailsAsKeyAndValue(leon);
printObjectDetailsAsKeyAndValue(milo);

