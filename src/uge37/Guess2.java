package uge37;

import javax.swing.*;
import java.util.Random;

public class Guess2 {                       // eksempel på if/else //
    public static void main(String[] args)
    {
        {
            int target;
            int svar;
            String guess;

            Random gen=new Random();
            target=gen.nextInt(1,100);
            guess=JOptionPane.showInputDialog("Gæt på et tal mellem 1 og 100");
            svar = Integer.parseInt(guess);
            while (target!=svar)
            {
                if (target < svar)
                {
                    guess=JOptionPane.showInputDialog("For højt");
                }
                else
                {
                    guess=JOptionPane.showInputDialog("For lavt");
                }



                svar = Integer.parseInt(guess);

            }


        }
    }
}