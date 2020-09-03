var myWindow;
function newWindow() {
    myWindow = window.open(
        "https://perscholas.org/",
        "perscholas",
        "width=400, height=200, resizable=yes, scrollbars=yes, location=yes");
    myWindow.focus();
}

function closeWindow() {
    myWindow.close();
}