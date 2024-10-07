package uge37;

public class CphMarathon {
    public static void main(String[] args)
    {
        invitation("Peter Adams",1556, 'D');
        invitation("Omar Farooq",1699, 'D');
        invitation("Lotte Nybo", 843, 'B');
    }
    static void invitation(String navn, int number, char gruppe)
    {
        System.out.println("Dear "+navn);
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is "+number);
        System.out.println("You start in group: "+gruppe);
        System.out.println("Please check in 10 mintues before start");
        System.out.println();

    }
}
