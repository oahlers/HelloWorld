package Uge35og36;

public class BankApp1 {
    public static void main(String[] arg) {
        String navn="Ole Hansen";
        double saldo=50.25;
        int knr=1;

        // Tilføjer 100 kr til Ole's konto//
            saldo=saldo+100;
        System.out.println("Konto " +knr+": "+saldo+" "+ navn);



        //Tilføjer 5% i rente//
        saldo=saldo*1.05;
        System.out.println("Konto " +knr+": "+saldo+" "+ navn);    
                                                                   

    }

}
