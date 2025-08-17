import GateWayA.PayPalGateWay;
import GateWayB.PhoneGateWay;
import GateWayadapter.GatewayBAdapter;
import GatewayInterface.PaymentGateWay;

public class Adapters{
    public static void main(String[] args){
        PaymentGateWay payPalGateWay = new PayPalGateWay();
        PaymentGateWay gateWay = new GatewayBAdapter(new PhoneGateWay());
        
        payPalGateWay.processPayment(120);
        gateWay.processPayment(110);
    }
}