package com.aboba.bruh;

public class ChildTicket extends Ticket {
    private double discount;

    public ChildTicket(){
        super();
        this.discount = 50;
    }
    @Override
    public double getCost(){
        return super.getCost()*(this.discount/100);
    }
}
