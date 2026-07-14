class Student:
    def __init(self,name):
        self.name=name

class Teacher:
    def __init__(self,name):
        self.name=name

    def teach(self,student):
        print(f"{self.name} teaches {student.name}")

s=Student("Rahul")
t=Teacher("Jhon")

t.teach(s)
    
