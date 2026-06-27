interface PaymentProcess{
    void pay(double amount);
}


class CreditCard implements PaymentProcess{
    public String name;
    public double amount;
    public CreditCard(String name){
        this.name=name;
        this.amount=amount;
    }
    @Override
    public void pay(double amount){
        System.out.println("Payment Amount:="+amount);
    }

}


class PayPal implements PaymentProcess{
    public String name;
    public String amount;
    public PayPal(String name){
        this.name=name;
        this.amount=amount;
    }

    @Override
    public void pay(double amount){
        System.out.println("PayPal Amount paid:-"+amount);
    }
}

class PaymentContext{
    private PaymentProcess paymentProcess;
    private double amount;
    public void setPaymentStrategy(String amount,PaymentProcess paymentProcess){
        this.paymentProcess=paymentProcess;
        this.amount=amount;
    }
    public void payProccessed() {
        paymentProcess.pay(amount);
    }
}



public class Strategy {
    public static void main(String[] args){

    }    
}
