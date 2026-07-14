from abc import ABC,abstractmethod


class Strategy(ABC):
    @abstractmethod
    def execute_strategy(self):
        pass


class ConcreteStrategyA(Strategy):
    def execute_strategy(self):
        return "Execute Strategy A"

class ConcreteStrategyB(Strategy):
    def execute_strategy(self):
        return "Execute Strategy B"


class Context:
    def __init__(self,strategy):
        self._strategy=strategy
    
    def set_strategy(self,strategy):
        self._strategy=strategy

    def execute_strategy(self):
        self._strategy.execute_strategy()

if __name__=="__main__":
    strategy_a=ConcreteStrategyA()
    strategy_b=ConcreteStrategyB()

    context=Context(strategy_a)
    print(context.execute_strategy())
    context.set_strategy(strategy_b)
    print(context.execute_strategy())