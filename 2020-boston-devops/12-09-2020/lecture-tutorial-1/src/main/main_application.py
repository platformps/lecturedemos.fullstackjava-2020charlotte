from src.main.calculator import Calculator


def run():
    operation_function = get_user_operation_function()
    operand_tuple = get_user_input()
    operand1 = operand_tuple[0]
    operand2 = operand_tuple[1]
    computed_value = operation_function(operand1, operand2)
    print("The computed value = " + computed_value)


def get_user_operation_function():
    print("Welcome to my calculator, from here you can enter any of the following options:")
    operation_string = str(input("Divide, Multiply, Add, Subtract")).lower()
    operation_function = None
    if operation_string == "divide":
        operation_function = Calculator.divide
    elif operation_string == "multiply":
        operation_function = Calculator.multiply
    elif operation_string == "add":
        operation_function = Calculator.add
    elif operation_string == "subtract":
        operation_function = Calculator.subtract
    else:
        operation_function = get_user_operation_function()
    return operation_function


def get_user_input():
    print("From here you can enter any of the following options:")
    first_operand = eval(input("Enter the first operand"))
    second_operand = eval(input("Enter the first second_operand"))
    operands = [first_operand, second_operand]
    return operands


def main():
    while True:
        run()
        user_input = input("Would you like to continue?")
        if user_input == "no":
            break


main()
