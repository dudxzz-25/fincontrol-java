package com.eduardo.fincontrol;
import java.io.*; import java.nio.file.*;
public class CsvRepository {
    private final Path path;
    public CsvRepository(Path path){ this.path=path; }
    public Bank load() throws IOException {
        Bank bank=new Bank(); if(!Files.exists(path)) return bank;
        for(String line:Files.readAllLines(path)){
            if(line.isBlank()||line.startsWith("number,")) continue;
            String[] p=line.split(",",4); int n=Integer.parseInt(p[0]); double b=Double.parseDouble(p[3]);
            Account a=p[2].equals("POUPANCA")?new SavingsAccount(n,p[1],b):new CheckingAccount(n,p[1],b); bank.add(a);
        } return bank;
    }
    public void save(Bank bank) throws IOException {
        Files.createDirectories(path.getParent());
        try(BufferedWriter w=Files.newBufferedWriter(path)){w.write("number,holder,type,balance\n");for(Account a:bank.all()){w.write(a.toCsv());w.newLine();}}
    }
}
