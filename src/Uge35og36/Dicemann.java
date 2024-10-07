package Uge35og36;

import java.util.Random; // Importere fra java-libary //

public class Dicemann {
    public static void main(String[] args) {
        Random gen=new Random();
        int tal= gen.nextInt(6)+1; //Hvis der ikke står +1, prøver programmet at køre fra 0-6. Med +1 = 1-6 //
        String activity="";

        if (tal==1){
            activity="Breakfast";
        }
        if (tal==2){
            activity="Study";
        }
        if (tal==3){
            activity="Swim";
        }
        if (tal==4){
            activity="Go fishing";
        }
        if (tal==5){
            activity="Call Mom";
        }
        if (tal==6){
            activity="Back to bed";
        }
        System.out.println(activity);
    }
}
