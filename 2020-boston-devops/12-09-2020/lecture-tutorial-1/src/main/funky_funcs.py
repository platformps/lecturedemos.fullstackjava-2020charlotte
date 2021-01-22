def my_funky_func(*args):
    print("Funky varargs")
    print(args)


def my_funky_func(x, y, z):
    print("Funky 5")
    print(x, y, z)




a = 'The'
b = 'Quick'
c = 'Brown'
my_funky_func(a, b, c, 30, 40, 50)