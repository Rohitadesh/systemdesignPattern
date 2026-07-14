from abc import ABC,abstractmethod

# Target interface
class PaymentGateway(ABC):
    @abstractmethod
    def pay(self,amount):
        pass


# Third party service 
class StripService:
    def make_payment(self,dollors):
        print(f"stripe paid ${dollors}")

class StripAdapter(PaymentGateway):
    def __init__(self,strip_service):
        self.stripe=strip_service
    def pay(self,amount):
        self.stripe.make_payment(amount)


class ShoppingCart:
    def checkout(self,gateway:PaymentGateway):
        gateway.pay(500)


strip_service=StripService()
adapter=StripAdapter(strip_service)
shop=ShoppingCart()
shop.checkout(adapter)