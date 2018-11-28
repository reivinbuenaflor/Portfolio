'''
This calculate the bmi of a user.
Calcution done by following the formula weight/height*height or weight/height**2.
'''

def userBMI_calculation(userWeight_kg, userHeight_m):
    return userWeight_kg/(userHeight_m*userHeight_m)

def getting_userBMI_results(userBMI_results):
    if userBMI_results >= 35 or userBMI_results >= 30:
        print("Your BMI Result is: ")
        print(userBMI_results)
        print("You are Obese, Try to reduce more weight")
    elif userBMI_results >= 29 or userBMI_results >= 25:
        print("Your BMI Result is: ")
        print(userBMI_results)
        print("You are Overweight, Try to reduce your weight")
    elif userBMI_results >= 24 or userBMI_results >= 19:
        print("Your BMI Result is: ")
        print(userBMI_results)
        print("You are Normal")
    else:
        print("Your BMI Result is: ")
        print(userBMI_results)
        print("You are Underweight, Try to gain more weight")
    return userBMI_results