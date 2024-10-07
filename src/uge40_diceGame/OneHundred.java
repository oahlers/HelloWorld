package uge40_diceGame;

public class OneHundred {
    Player p1=new Player("Jill");
    Player p2=new Player("Bob");
    Player p3=new Player("Dave");

    void play(){
        int AntalSlag=0;

        System.out.println(p1+"\t"+p2+"\t\t"+p3);
        while (p1.sum<100 && p2.sum<100 && p3.sum<100) {
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println(p1.sum + "\t\t" + p2.sum+"\t\t" + p3.sum);
            AntalSlag++;

            if (p1.sum >= 100 && p2.sum >= 100 || p1.sum >= 100 && p3.sum >= 100 || p3.sum >= 100 && p2.sum >= 100)
                System.out.println("Det er udafgjort!");
            else if (p1.sum >= 100) {
                System.out.println("Tillykke " + p1.name + " du har vundet med " + AntalSlag+ " slag.");

            } else if (p2.sum >= 100) {
                System.out.println("Tillykke " + p2.name + " du har vundet med " + AntalSlag+ " slag.");
            }
            else if (p3.sum>=100){
                System.out.println("Tillykke " + p3.name + " du har vundet med " + AntalSlag+ " slag.");
            }
        }

    }

    public static void main(String[] args) {
        OneHundred game=new OneHundred();
        game.play();
    }
}
