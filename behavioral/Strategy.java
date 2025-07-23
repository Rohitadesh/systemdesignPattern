interface  PaymentStrategy{
    void processPayment(double  amount);
}

class PayPalStrategy implements PaymentStrategy{
    private String email;
    private String password;
    public PayPalStrategy(String email,String password){
        this.email=email;
        this.password=password;
    }
    @Override
    public void processPayment(double amount){
     System.out.println("the amount is processing"+amount);
    
    }
}

class StripeStrategy implements PaymentStrategy{
    private String privateKey;
    public StripeStrategy(String privateKey){
        this.privateKey=privateKey;
    }
    @Override
    public void processPayment(double amount){
       System.out.println("the amount is processing"+amount);
    }
}

class PaymentContext{
    private PaymentStrategy paymentStrategy;
    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
       public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}

class Strategy {
    public static void main(String[] args){
           PaymentStrategy paypalStrategy = new PayPalStrategy("paypal@example.com", "password");
        PaymentContext paymentContext = new PaymentContext(paypalStrategy);
           // Process payment using PayPal
        paymentContext.processPayment(100.0);

        // Switch to Stripe strategy
        PaymentStrategy stripeStrategy = new StripeStrategy("stripe-api-key");
        paymentContext.setPaymentStrategy(stripeStrategy);

        // Process payment using Stripe
        paymentContext.processPayment(150.0);





    }    
}
