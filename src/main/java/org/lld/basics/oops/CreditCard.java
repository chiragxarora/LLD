package org.lld.basics.oops;

public class CreditCard extends Card {
    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public boolean Pay() {
        System.out.println("making payment via credit card!  " + cardNo);
        return true;
    }
}
