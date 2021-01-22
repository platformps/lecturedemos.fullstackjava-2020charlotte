# Created by Leon Hunter at 1:27 PM 12/1/2020
some_string = "Python,Java"
some_string.upper() # strings are immutable; result is garbage collected
print("I expect the casing to not change")
print(some_string)


some_string_lower_cased = some_string.lower()
print("I expect the casing to change")
print(some_string_lower_cased)


length = len(some_string_lower_cased)
start_index = 1
end_index = length
step = 1
opposite_step = -step


stringX1 = some_string_lower_cased[start_index:end_index:step]
stringX2 = some_string_lower_cased[::step]
print("stringX1 = " + stringX1)
print("stringX2 = " + stringX2)

stringY1 = some_string_lower_cased[end_index:start_index:opposite_step]
stringY2 = some_string_lower_cased[::opposite_step]
print("stringY1 = " + stringY1)
print("stringY2 = " + stringY2)









# print(some_string + "in lowercases is" + some_string.lower())
# print(some_string + "in uppercases is" + some_string.upper())
# print(some_string + "with n replaced by r is" + some_string.replace('n', 'r'))
# print(some_string + "with all leading/trailing whitespaces removed is" + some_string.strip())
# print(some_string + "splited by commas into list is", some_string.split(','))