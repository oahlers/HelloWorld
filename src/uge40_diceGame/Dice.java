package uge40_diceGame;

import java.util.Random;

public class Dice {
    static  Random gen=new Random();
    int roll(){
        int result= gen.nextInt(6)+1;  // eller return gen.nextInt(6); og drop tildeling af result //
        return result;
    }

    public static void main(String[] args) {
        Dice d=new Dice();
        int x=d.roll();
        for (int i=1; i<=10; i++)
            System.out.println(d.roll());
    }
}
