'''
Input for Weight and Height of a user and outputs the bmi result of a user.
'''
import bmi_calculation

print("What is your Weight?: ")
userWeight_kg = float(input())
print("What is your Height?: ")
userHeight_m = float(input())

userBMI_results = bmi_calculation.userBMI_calculation(userWeight_kg, userHeight_m)
bmi_calculation.getting_userBMI_results(userBMI_results)



