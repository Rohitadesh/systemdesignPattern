from abc import ABC

class FlyWeight(ABC):
    @abstractmethod
    def operation(self,extrisinc):
        pass


class ConcentreteFlyWeight(FlyWeight):
    def __init__(self,intrinsic):
        self._intrinsic=intrinsic
    
    def operation(self, extrisinc):
          return f"ConcreteFlyweight: Intrinsic State - {self._intrinsic}, Extrinsic State - {extrisinc}"


class FlyweightFactory:
    self._flyweights={}

    @staticmethod
    def get_flyweight(key):
         if key not in FlyweightFactory._flyweights:
            FlyweightFactory._flyweights[key] = ConcreteFlyweight(key)
        return FlyweightFactory._flyweights[key]