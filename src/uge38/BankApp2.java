package uge38;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1=new Account(1, "Joe Pass", 2.5);
        Account a2=new Account(2, "Jimmy Hendrix", 2.5);

        a1.deposit(200);
        a1.deposit(1000);
        a1.withdraw(400);
        a1.annualInterest();

        System.out.println(a1);
        System.out.println(a2);
    }
}

class Account {
    private int accountNo;
    private String owner;
    private double balance;         // indestående i kr
    private double intereatRate;    // rentesats i %

    Account(int ac, String ow, double rate){
        accountNo=ac;
        owner=ow;
        balance=0;
        intereatRate=rate;
    }

    public void deposit(double amount){
        balance=balance+amount;
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }

    public void annualInterest(){
        double intrest=balance*intereatRate/100;
        balance=balance+intrest;
    }

    public String toString(){
        return "Kontonr "+accountNo+": "+owner+" "+balance;
    }
}
