const changeTextLambda = () => {    
    const pSelector = document.querySelector('p');
    p.textContent = "I changed because of an inline event handler";
}

function changeTextFunction() {
    var x = "some value";
    const pSelector = document.querySelector('p');
    pSelector.textContent = "I changed because of an inline event handler";
}

console.log(x);