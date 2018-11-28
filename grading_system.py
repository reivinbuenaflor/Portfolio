'''
This Functions Calculates quiz average, mastery exam average, exam average, and the learning output of a student
'''
def getting_quizAve_student(quiz_1, quiz_2, quiz_3, quiz_4, quiz_5, quiz_6):
    return  (quiz_1 + quiz_2  + quiz_3 + quiz_4 + quiz_5 + quiz_6) / 6
def getting_mtExamAve_student(mtExam_1, mtExam_2, mtExam_3):
    return (mtExam_1 + mtExam_2 + mtExam_3) / 3
def getting_examAve_student(preExam, midExam, fExam):
    return (preExam + midExam + fExam) / 3
def getting_lOutput_student(quizAve, mtExamAve, examAve):
    return float((quizAve * .30) + (mtExamAve * .30) + (examAve * .40))
def getting_lOutput_results(lOutput):
    if lOutput >= 100 or lOutput >= 90:
        print("The Student got 1")
        print("The Student Passed the First Semester!")
    elif lOutput >= 89 or lOutput >= 80:
        print("The Student got 2")
        print("The Student Passed the First Semester!")
    elif lOutput >= 79 or lOutput >= 70:
        print("The Student got 3")
        print("The Student Passed the First Semester!")
    else:
        print("The Student got 4")
        print("The Sudent Failed the First Semester!")
    return lOutput

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
fExam = int(input(print("Enter the result of Finals: ")))

quizAve = getting_quizAve_student(quiz_1, quiz_2, quiz_3, quiz_4, quiz_5, quiz_6)
mtExamAve = getting_mtExamAve_student(mtExam_1, mtExam_2, mtExam_3)
examAve = getting_examAve_student(preExam, midExam, fExam)
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