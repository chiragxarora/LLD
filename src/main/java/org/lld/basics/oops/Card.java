package org.lld.basics.oops;

abstract public class Card implements PaymentMethod{
    protected String cardNo;   // protected members can be accessed via child classes too!
    protected String userName;

    public Card(String cardNo, String userName) {
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getCardNo() {
        return cardNo;
    }
}
