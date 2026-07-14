class Enginee:
    def start(self):
        print("Engine Started")

class Car:
    def __init__(self):
        self.engine=Enginee()

    def drive(self):
        self.enginee.start()
        print("Driving")

car=Car()
car.drive()