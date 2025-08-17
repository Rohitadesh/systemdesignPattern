package GateWayadapter;

import GateWayB.PhoneGateWay;
import GatewayInterface.PaymentGateWay;

// @AllArgsConstructor
public class GatewayBAdapter implements PaymentGateWay  {
    private PhoneGateWay phoneGateWay;

    public GatewayBAdapter(PhoneGateWay phoneGateWay2) {
       this.phoneGateWay=phoneGateWay2;
    }

    @Override
    public void processPayment(double amount) {
        phoneGateWay.charge(amount);
    }
}
