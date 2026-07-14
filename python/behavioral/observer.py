from abc import ABC,abstractmethod


class Subject(ABC):
    def __init__(self):
        self._observers=set()
    
    def attach(self,observer):
        self._observers.add(observer)
    
    def detach(self,observer):
        self._observers.remove(observer)

    def notify_observers(self):
        for observer in self._observers:
            observer.update()


class Observer(ABC):
    @abstractmethod
    def update(self):
        pass

class  ConcreteObserver(Observer):
    def __init(self,name):
        self.name=name

    def update(self):
        print(f"{self.name} has been notified")


if __name__=="__main__":
    subject=Subject()


    observer1=ConcreteObserver("Observer1")
    observer2=ConcreteObserver("Observer2")
    observer3=ConcreteObserver("Observer3")

    subject.attach(observer1)
    subject.attach(observer2)
    subject.attach(observer3)
    subject.notify_observers()
