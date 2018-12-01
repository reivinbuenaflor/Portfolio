'''
This Functions Calculates quiz average, mastery exam average, exam average, and the learning output of a student
'''
class grading_system_lOutput(self, quiz, mtExam,  ):
    pass

#Getting Input for Quizzes of a Student
quiz_1 = int(input(print("Enter the result of Quiz 1: ")))
quiz_2 = int(input(print("Enter the result of Quiz 2: ")))
quiz_3 = int(input(print("Enter the result of Quiz 3: ")))
quiz_4 = int(input(print("Enter the result of Quiz 4: ")))
quiz_5 = int(input(print("Enter the result of Quiz 5: ")))
quiz_6 = int(input(print("Enter the result of Quiz 6: ")))

#Getting Input for Mastery Exams of a Student
mtExam_1 = int(input(print("Enter the result of Mastery Exam 1: ")))
mtExam_2 = int(input(print("Enter the result of Mastery Exam 2: ")))
mtExam_3 = int(input(print("Enter the result of Mastery Exam 3: ")))

#Getting Input for Exams of a Student
preExam = int(input(print("Enter the result of Prelim: ")))
midExam = int(input(print("Enter the result of Midterm: ")))
fnExam = int(input(print("Enter the result of Finals: ")))

quizAve = getting_quizAve_student(quiz_1, quiz_2, quiz_3, quiz_4, quiz_5, quiz_6)
mtExamAve = getting_mtExamAve_student(mtExam_1, mtExam_2, mtExam_3)
examAve = getting_examAve_student(preExam, midExam, fnExam)
lOutput = getting_lOutput_student(quizAve, mtExamAve, examAve)
getting_lOutput_results(lOutput)

print("Quiz Average: ")
print(quizAve)
print("Mastery Exam Average: ")
print(mtExamAve)
print("Examination Average: ")
print(examAve)
print("Learning Output: ")
print(lOutput)  
