function injectListItems(numberOfListItems) {
    let ulSelector = document.querySelector("ul");
    for(let i=0; i<numberOfListItems; i++) {
        let newListItem1 = document.createElement("li");
        newListItem1.textContent = "Injected Item " + i;
        ulSelector.appendChild(newListItem1);
    }
}

injectListItems(99);