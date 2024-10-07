package uge37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine
{
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args)
    {
        double a=0;
        double b=0;
        double res;
        char op;
        boolean keepGoing=true;

        while (true)
        {
            System.out.println("Velkommen til Regnemaskinen");
            System.out.println("  + for addition");
            System.out.println("  - for substraktion");
            System.out.println("  * for multiplikation");
            System.out.println("  / for division");
            System.out.println("  q for quit");

            System.out.println("Indtast for operator: ");
            op=keyboard.next().charAt(0); // Bruger første position indenfor strengen //
            if (op=='q') break;
            a=readDouble("Indtast a");
            b=readDouble("Indtast b");

            switch (op)
            {
                case '+': res=a+b; break;
                case '-': res=a-b; break;
                case '*': res=a*b; break;
                case '/': res=a/b; break;
                default:
                    System.out.println("Ugyldig operator");
                    continue;
            }
            System.out.println("Resultatet: "+a+op+b+"=" +res);

        }
        System.out.println("Tak for i dag.");
    }
    static double readDouble(String prompt)
    {
        double n=0;
        boolean ok=false;
        while(!ok) {
            try {
                System.out.println(prompt);
                n = keyboard.nextDouble();
                ok=true;
            } catch (InputMismatchException e)
            {
                System.out.println("Ulovligt input. Prøv igen.");
                keyboard.nextLine();
            }
        }
        return n;
    }
}
