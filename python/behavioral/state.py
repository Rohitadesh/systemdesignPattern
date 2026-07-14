class CheckoutState:
    def add_items(self,item):
        pass
    def review_cart(self):
        pass
    
    def entire_shopping(self,info):
        pass
    def process_payment(self):
        pass


class EmptyCartState(CheckoutState):
    def add_items(self, item):
        print("Items adds cart")
        return ItemsAddCart()
    def review_cart(self):
        print("Review the cart")
    def entire_shopping(self):
        print("entire shopping the process")
    
    def process_payment(self):
        print("Process payment and the process")

class ItemsAddCart(CheckoutState):
    def add_items(self,item):
        print("Items add to be part")

    def review_cart(self):
        print("entering the shipment information")
        return ShippingInformationEnteredState()
    
    def entire_shopping(self, info):
        print("entire_shopping the item carts")
    
    def process_payment(self):
        print("Process the payment the process the cart")
    
class ShippingInformationEnteredState(CheckoutState):
    def add_items(self, item):
        print("Shipping the information cart")

    def review_cart(self):
        print("Review the Shipping the process")
    
    def entire_shopping(self,info):
        print("Shippinng is done the process")
    
    def process_payment(self):
        print("Process and the shipment payment")


class CheckoutContext:
    def __init__(self):
        self.current_state=EmptyCartState()
    
    def add_items(self,items):
        self.current_state=self.current_state.add_items(items)
    
    def review_cart(self):
        self.current_state=self.current_state.review_cart()
    
    def enter_shipping_info(self,info):
        self.current_state=self.current_state.entire_shopping(info)
    
    def process_payment(self):
        self.current_state.process_payment()