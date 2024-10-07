package uge37;

import java.util.Scanner;

public class GuessANumberReverse {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int low = 1;
    int high = 100;
    int guess;
    String response = "";

        System.out.println("Tænk på et nummer mellem 1-100 og jeg prøver at gætte det.");
        System.out.println("Svar med 'højere', 'lavere', eller 'korrekt'.");

        while (!response.equals("korrekt")) {
        guess = (low + high) / 2;
        System.out.println("Er dit nummer " + guess + "?");
        response = scanner.nextLine().toLowerCase();

        if (response.equals("højere")) {
            low = guess + 1;
        } else if (response.equals("lavere")) {
            high = guess - 1;
        } else if (!response.equals("korrekt")) {
            System.out.println("Svar med 'højere', 'lavere' eller 'korrekt'.");
        }
    }

        System.out.println("Jaa! Jeg fandt det rigtige nummer");
        scanner.close();
}
}
