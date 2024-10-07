package uge37;

public class Invitation {                               // eksempel på metode //
    public static void main(String[] args)
    {
        invitation("Birgitte");
        invitation("Lars");
        invitation("Johan");
    }
    static void invitation(String navn)
    {
        System.out.println("Kære "+navn);
        System.out.println("Vil du komme til min fødselsdag");
        System.out.println("Fredag 13/9-2024");
        System.out.println("Kærlig hilsen Bjørn");
        System.out.println();

    }
}
