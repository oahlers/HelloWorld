package Uge35og36;

import javax.swing.*;
import java.util.Random;

public class Dicemann_switch {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(6) + 1;
        String acitivty = "";
        switch (tal)
        {
            case 1:
                acitivty = "breakfast";
                break;
            case 2:
                acitivty = "Study";
                break;
            case 3:
                acitivty = "Swim";
                break;
            case 4:
                acitivty = "Go fishing";
                break;
            case 5:
                acitivty = "Call Mom";
                break;
            case 6:
                acitivty = "Back to bed";
                break;
        }
        JOptionPane.showMessageDialog(null,acitivty);
        System.out.println(acitivty);
    }
}
