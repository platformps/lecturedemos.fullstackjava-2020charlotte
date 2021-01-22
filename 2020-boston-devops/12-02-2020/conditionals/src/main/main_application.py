print("Hello world")


def print_area_ifelse(radius):
    condition = radius >= 0
    if condition:
        area = radius * radius * 3.14159
        print("The area for the circle of radius ", radius, "is", area)

    else:
        print("Negative input")


def print_area_justifs(radius):
    condition = radius >= 0
    if condition:
        area = radius * radius * 3.14159
        print("The area for the circle of radius ", radius, "is", area)

    if not condition:
        print("Negative input")


print_area_ifelse(10)
print_area_ifelse(-10)