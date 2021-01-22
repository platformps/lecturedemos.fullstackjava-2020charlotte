def nullary_function():
    print("Hello world")


def get_user_info():
    user_info = []
    user_name = input("What is your name?")
    user_age = input("What is your age?")

    user_info.append(user_name)
    user_info.append(user_age)
    print(user_info)


def parameterized_function(some_person_name):
    print("Hello! And welcome " + some_person_name)


def add(x, y):
    sum = x + y
    return sum


def repeat_print(number_of_repeats, value_of_message):
    for i in range(number_of_repeats):
        print(value_of_message)

def vararg_function(*args):
    for val in args:
        print(val)


vararg_function("Leon", "Hunter", 27)

#
# expect = 15
# actual = add(10, 5)
#
# nullary_function()
# parameterized_function("Leon")
# repeat_print(100, "The Quickest Brown Fox")
# get_user_info()
