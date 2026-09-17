package com.eduardo.fincontrol;
public class SavingsAccount extends Account {
    public SavingsAccount(int number,String holder,double balance){ super(number,holder,balance); }
    public void applyMonthlyInterest(double rate){ if(rate<0) throw new IllegalArgumentException("Taxa inválida"); balance += balance*rate; }
    @Override public String type(){ return "POUPANCA"; }
}
