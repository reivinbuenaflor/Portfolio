import os

class bmi_calculator_cls:
    
    def __init__ (self, weight , height):
        self.weight = weight
        self.height = height
    
    def user_bmi_calculation(self):
        bmi_calculator_cls.userBMI_results = self.weight / (self.height * self.height)
        return bmi_calculator_cls.userBMI_results
    
    def user_bmi_results(self):
        if bmi_calculator_cls.userBMI_results >= 35 or bmi_calculator_cls.userBMI_results >= 30:
            print("Your BMI Result is: ")
            print(bmi_calculator_cls.userBMI_results)
            print("You are Obese, Try to reduce more weight")
        elif bmi_calculator_cls.userBMI_results >= 29 or bmi_calculator_cls.userBMI_results >= 25:
            print("Your BMI Result is: ")
            print(bmi_calculator_cls.userBMI_results)
            print("You are Overweight, Try to reduce your weight")
        elif bmi_calculator_cls.userBMI_results >= 24 or bmi_calculator_cls.userBMI_results >= 19:
            print("Your BMI Result is: ")
            print(bmi_calculator_cls.userBMI_results)
            print("You are Normal")
        else:
            print("Your BMI Result is: ")
            print(bmi_calculator_cls.userBMI_results)
            print("You are Underweight, Try to gain more weight")
        return bmi_calculator_cls.userBMI_results

clear = lambda: os.system('cls')

while True:
    user = bmi_calculator_cls(
        float(input('Enter your Weight(kg): ')),
        float(input('Enter your Height(m): ')), 
    )
    user.user_bmi_calculation()
    user.user_bmi_results()
    repeat = input("Do you want another results? Y/N: ")
    if repeat == "y" or repeat == "Y":
        clear()
        continue
    else:
        clear()
        exit()




