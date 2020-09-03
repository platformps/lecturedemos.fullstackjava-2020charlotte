let sampleCssSelector = document.querySelector("body");
let parentElement = sampleCssSelector.parentElement;
let childNodes = sampleCssSelector.childNodes;
// console.log(parentElement);
for(let i=0; i<childNodes.length; i++) {
    let childNode = childNodes[i];
    console.log(childNode);
}
