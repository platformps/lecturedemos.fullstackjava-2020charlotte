# Created by Leon Hunter at 11:43 AM 12/1/2020
print("Enter a character value:")
user_input = input()

if user_input >= 'A' and user_input <= 'Z':
    print(user_input + " is an uppercase letter")

elif user_input >= 'a' and user_input <= 'z':
    print(user_input + " is a lowercase letter")

elif user_input >= '0' and user_input <= '9':
    print(user_input + " is a numeric character")
else:
    print(user_input + " is not a alphanumeric character")
