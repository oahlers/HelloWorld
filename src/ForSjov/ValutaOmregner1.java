package ForSjov;

import java.util.Scanner;

public class ValutaOmregner1 {
    public static double omregnValuta(double dkk, double kurs) {
        return Math.round(dkk * kurs * 100.0) / 100.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DKK_TO_SEK = 1.45; // Danske kroner til svenske kroner
        final double DKK_TO_NOK = 1.38; // Danske kroner til norske kroner
        final double DKK_TO_EUR = 0.13; // Danske kroner til euro
        final double DKK_TO_ISK = 19.35; // Danske kroner til islandske kroner

        while (true) {
            // Menu
            System.out.println("Velkommen til ValutaVeksler!");
            System.out.println("Vælg den valuta, du vil veksle til:");
            System.out.println("1. Svenske kroner (SEK)");
            System.out.println("2. Norske kroner (NOK)");
            System.out.println("3. Euro (EUR)");
            System.out.println("4. Islandske kroner (ISK)");
            System.out.println("0. Afslut programmet");

            int valg = scanner.nextInt();

            // Hvis brugeren vælger at afslutte (indtaster 0)
            if (valg == 0) {
                System.out.println("Programmet afsluttes.");
                break;
            }

            // Spørg om beløbet i danske kroner
            System.out.print("Indtast beløbet i danske kroner (DKK): ");
            double dkk = scanner.nextDouble();

            // Hvis brugeren indtaster 0 kr, afslut omregningen
            if (dkk == 0) {
                System.out.println("Du har valgt at afslutte omregninger.");
                break;
            }

            // Omregn beløbet til den valgte valuta
            double omregnetBeløb = 0;
            switch (valg) {
                case 1:
                    omregnetBeløb = omregnValuta(dkk, DKK_TO_SEK);
                    System.out.println(dkk + " DKK svarer til " + omregnetBeløb + " SEK.");
                    break;
                case 2:
                    omregnetBeløb = omregnValuta(dkk, DKK_TO_NOK);
                    System.out.println(dkk + " DKK svarer til " + omregnetBeløb + " NOK.");
                    break;
                case 3:
                    omregnetBeløb = omregnValuta(dkk, DKK_TO_EUR);
                    System.out.println(dkk + " DKK svarer til " + omregnetBeløb + " EUR.");
                    break;
                case 4:
                    omregnetBeløb = omregnValuta(dkk, DKK_TO_ISK);
                    System.out.println(dkk + " DKK svarer til " + omregnetBeløb + " ISK.");
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    break;
            }

            System.out.println(); // Linjeskift for at adskille omregningerne
        }

        scanner.close(); // Luk scanner for at undgå ressource lækager
    }
}
