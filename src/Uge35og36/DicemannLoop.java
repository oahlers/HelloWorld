package Uge35og36;

import java.util.Random;
import java.util.Scanner;

public class DicemannLoop {
    public static void main(String[] args) {
        Random gen = new Random();
        String activity = "";
        int tal = 0;
        boolean keepGoing=true;
        Scanner keyboard=new Scanner(System.in); /// Forbinder til compueterens tastatur ///

        while (keepGoing) {   /// != betyder ikke er lig med ///
            tal=gen.nextInt(6)+1;

            if (tal == 1) {
                activity = "Breakfast";
            }
            if (tal == 2) {
                activity = "Study";
            }
            if (tal == 3) {
                activity = "Swim";
            }
            if (tal == 4) {
                activity = "Go fishing";
            }
            if (tal == 5) {
                activity = "Call Mom";
            }
            if (tal == 6) {
                activity = "Back to bed";
            }
            System.out.println(activity);
//            if (tal==6) keepGoing=false;
            System.out.println("Vil du stoppe (yes/no)?");
            String answer=keyboard.next();
            if (answer.equals("yes")) keepGoing=false;
        }
        System.out.println("Bye bye");

    }
}

