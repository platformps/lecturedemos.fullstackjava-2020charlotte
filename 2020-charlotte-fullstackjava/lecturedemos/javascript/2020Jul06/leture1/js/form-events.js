const name = document.getElementById("fname");

function changeToCoral() {
    name.style.backgroundColor = "coral";
}

function changeToWhite() {
    name.style.backgroundColor = "white";
}

function addFormListeners() {
    name.addEventListener("focus", changeToCoral);
    name.addEventListener("blur", changeToWhite);
    document
        .querySelector("form")
        .addEventListener("submit", function() {
            alert(name.value);
        });

}

function addKeyboardListeners() {
    const keyPressFunction = function() {
        let keyCode = event.keyCode;
        let key = event.key;
        let code = event.code;

        console.log("Key Code = " + keyCode);
        console.log("Key = " + key);
        console.log("Code = " + code);
    }
    document.addEventListener("keypress", keyPressFunction);
}


// addFormListeners();
addKeyboardListeners();