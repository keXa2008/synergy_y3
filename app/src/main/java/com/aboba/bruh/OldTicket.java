package com.aboba.bruh;

public class OldTicket extends Ticket {
    private int discount;

    public OldTicket() {
        super();
        this.discount = 30;
    }
    @Override
    public double getCost() {
        return super.getCost()*(this.discount/100);
    }
}
