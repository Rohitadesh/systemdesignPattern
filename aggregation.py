class Employee:
    def __init__(self,name):
        self.name=name


class Department:
    def __init__(self):
        self.employee=[]
    
    def add_employee(self,employee):
        self.employees.append(employee)



emp1=Employee("Rahul")
emp2=Employee("Ankit")

dept=Department()
dept.add_employee(emp1)
dept.add_employee(emp2)

for emp in dept.employees:
    print(emp.name)