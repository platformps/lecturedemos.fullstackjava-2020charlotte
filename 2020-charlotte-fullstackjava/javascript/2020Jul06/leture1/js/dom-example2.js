let allParagraphs = document.querySelector("p");
for(let index=0; index<allParagraphs.length; index++) {
    let currentParagraph = allParagraphs[index];
    console.log("This is the " + index + " child");
    console.log(currentParagraph);
}

