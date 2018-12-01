'''
Input and output for Learning Output of a Students
'''
import os
from grading_system_calculation import student_lOutput

clear = lambda: os.system('cls')

while True:
    user = student_lOutput(
        float(input("Enter the result of Quiz 1: ")),
        float(input("Enter the result of Quiz 2: ")),
        float(input("Enter the result of Quiz 3: ")),
        float(input("Enter the result of Quiz 4: ")),
        float(input("Enter the result of Quiz 5: ")),
        float(input("Enter the result of Quiz 6: ")),
        float(input("Enter the result of Mastery Exam 1: ")),
        float(input("Enter the result of Mastery Exam 2: ")),
        float(input("Enter the result of Mastery Exam 3: ")),
        float(input("Enter the result of Prelim Exam: ")),
        float(input("Enter the result of Midterm Exam: ")),
        float(input("Enter the result of Final Exam: "))
    ) 
    user.getting_quizAve()
    user.getting_mtExamAve()
    user.getting_examAve()
    user.getting_lOutputAve()
    user.getting_student_acadAve()

    cont = input("Do you want to continue? Y/N: ")
    if cont == "y" or cont == "Y":
        clear()
        continue
    else:
        clear()
        os._exit(1) 
