# Created by Leon Hunter at 2:53 PM 11/30/2020
some_value = "hello"
some_value_first_char = some_value[0]
some_value_first_three_chars = some_value[3]
output = '''
`some_value_first_char` has a value of {}
`some_value_first_three_chars` has a value of {}
'''
print(output.format(some_value_first_char, some_value_first_three_chars))
#print(some_value * 100)  # prints `someVal` 100 times





def replace_all_repeat():
    string_value = "The quick brown fox jumps over the lazy dog"
    for removeable_character in "aeiou":
        string_value.replace(removeable_character, "_")

