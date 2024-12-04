package org.lld.basics.oops;

import java.util.HashMap;

public class PaymentService {
    private HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        paymentMethods = new HashMap<>();
    }

    void AddPaymentMethod(String name, PaymentMethod paymentMethod) {
        paymentMethods.put(name,paymentMethod);
    }

    boolean MakePayment(String name) {
        if(paymentMethods.containsKey(name)) {
            PaymentMethod target = paymentMethods.get(name);
            target.Pay();  // Runtime polymorphism
            return true;
        }
        else return false;
    }
}
