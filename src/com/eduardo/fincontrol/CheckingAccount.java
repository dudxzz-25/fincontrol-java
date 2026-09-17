package com.eduardo.fincontrol;
public class CheckingAccount extends Account {
    private final double overdraft;
    public CheckingAccount(int number,String holder,double balance){ super(number,holder,balance); this.overdraft=500.0; }
    @Override public double availableBalance(){ return getBalance()+overdraft; }
    @Override public String type(){ return "CORRENTE"; }
}
