package uge39;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp3 {
    public static void main(String[] args) {
        ArrayList<Account> list=new ArrayList<>();

        Indlaan a1=new Indlaan("Jill", 3);
        a1.deposit(100);
        a1.withdraw(50);

        Hojrente a2=new Hojrente("Bob", 10, 100000, LocalDate.of(2024, 12, 24));
        a2.deposit(20);
        a2.withdraw(100000);


        Kredit a3=new Kredit("Allan", 3);
        a3.withdraw(3000);

        Borneoparing a4=new Borneoparing("Erik", 10, 15000, LocalDate.of(2015,12,24));
        a4.withdraw(200);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
       for (Account a:list){
            a.annualInterest();
            a.deposit(100);     // Tilføjer 100kr til samtlige konti //
            a.withdraw(0);      //FIKSEDE MIDLERTIDIGT - PÅNÆR HOS ALLAN HJÆLP//
            a.printTransactions();
            System.out.println();
        }

    }
}

class Indlaan extends Account {
    Indlaan(String ow, double rate){
        super(ow, rate);  // super = man gør brug af overklassens constructor //
    }
    public void withdraw(double amount){
        if (amount>balance) {
            System.out.println("Der er ikke penge nok på kontoen.");
        }
        else {
            super.withdraw(amount);
        }
    }
}
class Hojrente extends Account {
    LocalDate releaseDate;

    Hojrente(String ow, double rate, double startBalance, LocalDate date){
        super(ow, rate);
        super.deposit(startBalance);
        releaseDate=date;
    }

    public void deposit(double amount){
        System.out.println("Der kan ikke sættes penge ind på denne konto.");
    }
    public void withdraw(double amount){
        LocalDate today=LocalDate.now();
        if (today.isBefore(releaseDate)){
            System.out.println("Pengene er bundet indtil  "+releaseDate);
        }
        else {
            super.withdraw(amount);
        }
    }
}
class Kredit extends Account {

    Kredit(String ow, double rate){
        super(ow, rate);  // super = man gør brug af overklassens constructor //
    }
    public void withdraw(double amount){
        if (balance-amount<=-2000) { // hvordan kan jeg få den til ikke at udskrive hvis den overgår beløb//
            System.out.println("Du kan ikke gå mere i minus.");
        }
        else {
            super.withdraw(amount);
        }
    }
}

class Borneoparing extends Account {
    LocalDate releaseDate;

    Borneoparing(String ow, double rate, double startBalance, LocalDate fodselsDato){
        super(ow, rate);
        super.deposit(startBalance);
        releaseDate=fodselsDato;
    }
    public void withdraw(double amount){
        LocalDate today=LocalDate.now();
        if (today.isBefore(releaseDate.plusYears(18))){
            System.out.println("Pengene er bundet indtil:  "+releaseDate.plusYears(18));
        }
        else {
            super.withdraw(amount);
            System.out.println("Tillykke du kan nu hæve fra din børneopsaring!");
        }
    }
}

//KAN IKKE FORSTÅ HVORFOR DER IKKE BLIVER PRINTET UD UNDER KONTI