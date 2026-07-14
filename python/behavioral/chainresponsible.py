from abc import ABC,abstractmethod
class Handler(ABC):
    @abstractmethod
    def handle_request(self,request):
        pass
    # @abstractmethod

class ConcreteHandlerA(Handler):
    def handle_request(self,request):
        if request=='A':
            print("Handled by Handler A")
        else:
            print("Passed to the parent handler")
            super().handle_request(request)


class ConcreteHandlerB(Handler):
    def handle_request(self, request):
        if request=='B':
            print("Handled by B")
        else:
            print("Passed to the parent Handler")
            super().handle_request(request)


class Chain:
    def __init__(self):
        self.handlers=[]

    def add_handler(self,handler):
        self.handlers.append(handler)
    
    def handle_request(self,request):
        for handler in self.handlers:
            handler.handle_request(request)


if __name__=='__main__':
    concreteA=ConcreteHandlerA()
    concreteB=ConcreteHandlerB()

    chain=Chain()
    chain.add_handler(concreteA)
    chain.add_handler(concreteB)

    requests=['A','B','C']
    for request in requests:
        print(f"Processing request:{request}")
        chain.handle_request(request)