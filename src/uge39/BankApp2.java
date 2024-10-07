package uge39;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1=new Account("Joe Pass", 2.5);
        Account a2=new Account("Jimmy Hendrix", 2.5);

        a1.deposit(200);
        a1.deposit(1000);
        a1.withdraw(400);
        a1.annualInterest();

        a1.printTransactions();
        System.out.println();
        a2.printTransactions();
        System.out.println();
    }
}

class Account {
    private int accountNo;
    protected String owner;
    protected double balance;         // indestående i kr
    protected double interestRate;    // rentesats i %
    private ArrayList<Transaction> transactions=new ArrayList<>();
    static private int noOfAccounts=0;  //Statisk sørger for at den er fælles for samtlige kontiobjekter //

    Account(String ow, double rate){
        noOfAccounts++;  // Tæller 1 op //
        accountNo=noOfAccounts;
        owner=ow;
        balance=0;
        interestRate =rate;
    }

    public void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat",amount, balance)); // Tilføjer arraylist //
    }

    public void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hæve",amount, balance));
    }

    public void annualInterest(){
        double intrest=balance* interestRate /100;
        balance=balance+intrest;
        transactions.add(new Transaction("Renter",intrest, balance));
    }
    public void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t: transactions){
            System.out.println(t);
        }
    }

    public String toString(){
        return "Kontonr "+accountNo+": "+owner+" "+balance;
    }

    class Transaction {
        String text;
        LocalDate date;
        double amount;
        double newBalance;

        Transaction(String text, double amount, double newBalance){ //constructor//
            this.text=text; // this = den eksakte variable //
            date=LocalDate.now();
            this.amount=amount;
            this.newBalance=newBalance;
        }
        public String toString() {
            return text + "\t" + date + "\t" + amount + "\t" + newBalance;
        }
    }
}
