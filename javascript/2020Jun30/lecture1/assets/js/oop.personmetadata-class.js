class PersonMetaData {
    constructor(firstName, lastName, favoriteColors) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteColors = favoriteColors;
    }
}

class Person {
    constructor(metaData) {
        this.metaData = metaData;
        this.additionalData = "default value..."
    }
}

let personData = new PersonMetaData("First", "last", []);
let someBody = new Person(personData)
someBody.additionalData = "Some other data value"
