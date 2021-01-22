# Created by Leon Hunter at 3:21 PM 11/30/2020

x = 'The quickest of the brown foxes'
y = 'The quickest of the brown foxe'
areEqual = x is y
x_memory_location = id(x)
y_memory_location = id(y)

print("x_memory_location = {} ".format(x_memory_location))
print("y_memory_location = {} ".format(y_memory_location))
print(areEqual)
