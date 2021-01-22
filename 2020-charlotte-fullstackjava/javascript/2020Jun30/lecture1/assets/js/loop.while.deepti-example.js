let terminalCondition = true;
while(terminalCondition) {
    let userInput = prompt("Enter password");
    terminalCondition = !"abc".equals(userInput);
}