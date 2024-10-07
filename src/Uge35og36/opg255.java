package Uge35og36;


import javax.swing.*;
import java.util.Random;

public class opg255 { ///opgave 1 ///
    public static void main(String[] args) {
        opgave1();
        System.out.println("opgave2");
        opgave2();
        System.out.println("opgave3");
        opgave3();
        System.out.println("opgave4");
        opgave4();
        System.out.println("opgave5");
        opgave5();
        }

    public static void opgave1()
    {
        for (int i=10; i>=0; i--) {
            System.out.println(i);

        }
    }

    public static void opgave2()
    {
        int buffer=0;
        for (int i = 1; i <= 20; i++) {
            buffer+=i;
            System.out.println(buffer);

        }
    }

    public static void opgave3()
    {
        for (int i = 2; i <=10 ; i++) {
            printTabel (i);
            
        }

    }
    public static void printTabel(int i)
    {
        for (int j=1; j<=10; j++) {
            System.out.print(i*j+"\t");
        }
        System.out.println();
    }
    public static void opgave4()
    {
        int y;
        for (int x = 0; x <= 10; x++) {
            y=3*x*x+6*x+9;
            System.out.println(y);

        }
        //DEL 2//
        System.out.println("Her starter del2");
        for (int x = 0; x <= 100; x+=10)  // += betyder =x+10 //
        {
            y=3*x*x+6*x+9;
            System.out.println(y);
        }
    }
    public static void opgave5()
    {
        int target;
        int svar;
        String guess;

        Random gen=new Random();
        target=gen.nextInt(1,20);
        guess=JOptionPane.showInputDialog("Gæt på et tal mellem 1 og 20");
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

