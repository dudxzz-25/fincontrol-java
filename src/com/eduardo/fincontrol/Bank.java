package com.eduardo.fincontrol;
import java.util.*;
public class Bank {
    private final Map<Integer,Account> accounts=new LinkedHashMap<>();
    public void add(Account a){ if(accounts.containsKey(a.getNumber())) throw new IllegalArgumentException("Conta já existe"); accounts.put(a.getNumber(),a); }
    public Account get(int number){ Account a=accounts.get(number); if(a==null) throw new IllegalArgumentException("Conta não encontrada"); return a; }
    public Collection<Account> all(){ return Collections.unmodifiableCollection(accounts.values()); }
    public void transfer(int from,int to,double amount){ get(from).transferTo(get(to),amount); }
}
