package com.eduardo.fincontrol;
import java.nio.file.Path; import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        CsvRepository repo=new CsvRepository(Path.of("data/accounts.csv")); Bank bank=repo.load(); Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n1 Criar conta | 2 Depositar | 3 Sacar | 4 Transferir | 5 Listar | 0 Sair");
            String op=sc.nextLine().trim();
            try{
                if(op.equals("0")){repo.save(bank);break;}
                switch(op){
                    case "1" -> {System.out.print("Número: ");int n=Integer.parseInt(sc.nextLine());System.out.print("Titular: ");String h=sc.nextLine();System.out.print("Tipo C/P: ");String t=sc.nextLine();bank.add(t.equalsIgnoreCase("P")?new SavingsAccount(n,h,0):new CheckingAccount(n,h,0));}
                    case "2" -> {System.out.print("Conta: ");int n=Integer.parseInt(sc.nextLine());System.out.print("Valor: ");bank.get(n).deposit(Double.parseDouble(sc.nextLine()));}
                    case "3" -> {System.out.print("Conta: ");int n=Integer.parseInt(sc.nextLine());System.out.print("Valor: ");bank.get(n).withdraw(Double.parseDouble(sc.nextLine()));}
                    case "4" -> {System.out.print("Origem: ");int a=Integer.parseInt(sc.nextLine());System.out.print("Destino: ");int b=Integer.parseInt(sc.nextLine());System.out.print("Valor: ");bank.transfer(a,b,Double.parseDouble(sc.nextLine()));}
                    case "5" -> bank.all().forEach(System.out::println);
                    default -> System.out.println("Opção inválida");
                }
                repo.save(bank);
            }catch(Exception e){System.out.println("Erro: "+e.getMessage());}
        }
    }
}
