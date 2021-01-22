let listItemParent = document.querySelector('ul');

console.log(listItemParent);
let arrayOfListItems = document.getElementsByTagName("li");
let listItem1 = arrayOfListItems[0];
let newListItem1 = document.createElement("li");
newListItem1.textContent = "New content"
listItemParent.replaceChild(newListItem1, listItem1)

console.log("Original List Item = " + listItem1.value);
console.log("New List Item = " + newListItem1.value);