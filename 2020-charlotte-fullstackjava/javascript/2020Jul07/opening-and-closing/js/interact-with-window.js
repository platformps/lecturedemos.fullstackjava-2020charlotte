for(let i=0; i<20; i++) {
    let p = document.createElement("p");
    p.textContent = i;
    document.body.appendChild(p);
}

let buttons = document.getElementsByTagName("button");
for(let i=0; i<buttons.length; i++) {
    let button = buttons[i];
    button.onclick = handleButtonPress;
}

function handleButtonPress(e) {
    if(e.target.id == "print") {
        window.print();
    } else if(e.target.id == "scroll") {
        window.scrollTo(0, 300);
    }
}