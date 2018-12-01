'''
This Calculates quiz average, mastery exam average, exam average, and the learning output of a student
'''
class student_lOutput:
    def __init__(self, quiz_1, quiz_2, quiz_3, quiz_4, quiz_5, quiz_6, mtExam_1, mtExam_2, mtExam_3, preExam, midExam, fExam):
        self.quiz_1 = quiz_1
        self.quiz_2 = quiz_2
        self.quiz_3 = quiz_3
        self.quiz_4 = quiz_4
        self.quiz_5 = quiz_5
        self.quiz_6 = quiz_6
        self.mtExam_1 = mtExam_1
        self.mtExam_2 = mtExam_2
        self.mtExam_3 = mtExam_3
        self.preExam = preExam
        self.midExam = midExam
        self.fExam = fExam
    def getting_quizAve(self):
        student_lOutput.quizAve = (self.quiz_1 + self.quiz_2 + self.quiz_3 + self.quiz_4 + self.quiz_5 + self.quiz_6)/6
        return student_lOutput.quizAve
    def getting_mtExamAve(self):
        student_lOutput.mtExamAve = (self.mtExam_1 + self.mtExam_2 + self.mtExam_3)/3
        return student_lOutput.getting_mtExamAve
    def getting_examAve(self):
        student_lOutput.examAve = (self.preExam + self.midExam + self.fExam)/3
        return student_lOutput.examAve
    def getting_lOutputAve(self):
        student_lOutput.student_acadPerformance = (student_lOutput.quizAve *.30) + (student_lOutput.mtExamAve *.30) + (student_lOutput.examAve * .40)
        return student_lOutput.student_acadPerformance
    def getting_student_acadAve(self):
        if student_lOutput.student_acadPerformance >= 100 or student_lOutput.student_acadPerformance >= 90:
            print("Student got 1")
            print("Quize Average: ")
            print(student_lOutput.quizAve)
            print("Mastery Exam Average: ")
            print(student_lOutput.mtExamAve)
            print("Exam Average: ")
            print(student_lOutput.examAve)
            print("Passed!")
        elif student_lOutput.student_acadPerformance >= 89 or student_lOutput.student_acadPerformance >= 80:
            print("Student got 2")
            print("Quize Average: ")
            print(student_lOutput.quizAve)
            print("Mastery Exam Average: ")
            print(student_lOutput.mtExamAve)
            print("Exam Average: ")
            print(student_lOutput.examAve)
            print("Passed!")
        elif student_lOutput.student_acadPerformance >= 79 or student_lOutput.student_acadPerformance >= 70:
            print("Student got 3")
            print("Quize Average: ")
            print(student_lOutput.quizAve)
            print("Mastery Exam Average: ")
            print(student_lOutput.mtExamAve)
            print("Exam Average: ")
            print(student_lOutput.examAve)
            print("Passed!")
        else:
            print("Student got 4")
            print("Quize Average: ")
            print(student_lOutput.quizAve)
            print("Mastery Exam Average: ")
            print(student_lOutput.mtExamAve)
            print("Exam Average: ")
            print(student_lOutput.examAve)
            print("Failed!")
        
