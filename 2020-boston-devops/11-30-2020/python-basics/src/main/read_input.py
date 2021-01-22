# Created by Leon Hunter at 2:28 PM 11/30/2020
print("Enter a value")
my_value_string = input()
my_value_string_type = type(my_value_string)
my_value_integer = int(my_value_string)
my_value_integer_type = type(my_value_integer)
my_value_string_evaluated = eval(my_value_string)
my_value_string_evaluate_type = type(my_value_string_evaluated)


output = '''
`my_value_string` has a value of {}
`my_value_string_type` has a value of {}
`my_value_integer` has a value of {}
`my_value_integer_type` has a value of {}
`my_value_string_evaluated` has a value of {}
`my_value_string_evaluated_type` has a value of {}
'''
print(output.format(
    my_value_string,
    my_value_string_type,
    my_value_integer,
    my_value_integer_type,
    my_value_string_evaluated,
    my_value_string_evaluate_type))


