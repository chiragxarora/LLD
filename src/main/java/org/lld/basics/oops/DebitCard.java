package org.lld.basics.oops;

public class DebitCard extends Card {

    public DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public boolean Pay() {
        System.out.println("making payment via debit card!  " + super.getCardNo());
        return true;
    }
}
