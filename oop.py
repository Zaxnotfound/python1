class Student:
    def __init__(self, name, grades):
        self.name = name
        self.grades = grades
    
    def calcu_grade(self):
        return sum(self.grades) / len(self.grades)
        
grade_category = lambda avg: (
        "A" if avg >= 90 else
        "B" if avg >= 80 else
        "C" if avg >= 70 else
        "D" if avg >= 60 else
        "F"
    )

student1 = Student("Paul", [89, 90, 92, 95])


average = student1.calcu_grade()
category = grade_category(average)

print(f"Student name: {student1.name}")
print(f"Student grade: {student1.grades}")
print(f"Grade category: {average:.2f}")
print(f"Grade category: {category}")