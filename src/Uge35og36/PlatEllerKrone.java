package Uge35og36;

import java.util.Random;

public class PlatEllerKrone {
    public static void main(String[] args) {
        Random gen=new Random();
        int tal= gen.nextInt(2); // Genererer tal fra 0-1 (2 tal) //
        System.out.println(tal); // Viser hvilket tal //

        if (tal==0){ // 1 = betyder tildelling og 2 == er et matematisk lighedstegn //
            System.out.println("Plat");
            System.out.println("Tillykke du har vundet");
        }
        else {
            System.out.println("Krone");
            System.out.println("Desværre du har tabt");
        }
    }
}
