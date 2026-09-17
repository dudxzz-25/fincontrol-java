package com.eduardo.fincontrol;

public abstract class Account {
    private final int number;
    private final String holder;
    protected double balance;
    public Account(int number, String holder, double balance) {
        if (number <= 0 || holder == null || holder.isBlank() || balance < 0) throw new IllegalArgumentException("Dados inválidos");
        this.number=number; this.holder=holder.trim(); this.balance=balance;
    }
    public int getNumber(){ return number; }
    public String getHolder(){ return holder; }
    public double getBalance(){ return balance; }
    public void deposit(double amount){ if(amount<=0) throw new IllegalArgumentException("Valor deve ser positivo"); balance+=amount; }
    public void withdraw(double amount){ if(amount<=0) throw new IllegalArgumentException("Valor deve ser positivo"); if(amount>availableBalance()) throw new IllegalArgumentException("Saldo insuficiente"); balance-=amount; }
    public void transferTo(Account target,double amount){ withdraw(amount); target.deposit(amount); }
    public double availableBalance(){ return balance; }
    public abstract String type();
    public String toCsv(){ return number+","+holder.replace(","," ")+","+type()+","+String.format(java.util.Locale.US,"%.2f",balance); }
    @Override public String toString(){ return "%d | %s | %s | saldo R$ %.2f".formatted(number,holder,type(),balance); }
}
