'''
Input for Weight and Height of a user and outputs the bmi result of a user.
'''
import os
from bmi_calculation import bmi_calculator_cls

clear = lambda: os.system('cls')

while True:
    user =  bmi_calculator_cls(
        float(input("Enter your Weight(kg): ")),
        float(input("Enter your Height(m): "))
    )
    user.user_bmi_calculation()
    user.user_bmi_results()
    
    cont = input("Do you want to continue? Y/N: ")
    if cont == "y" or cont == "Y":
        clear()
        continue
    else:
        clear()
        os._exit(1) 


