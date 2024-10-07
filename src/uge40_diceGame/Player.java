package uge40_diceGame;

public class Player {
    Cup cup = new Cup(); // instance of Cup
    String name;
    int sum = 0;

    Player(String name) {
        this.name = name;
    }

    void turn() {
        cup.roll(); // roll the dice
        sum += cup.getSum(); // use the instance 'cup' to call getSum()
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Player p = new Player("Bob");
        while (p.sum < 100) {
            p.turn();
            System.out.println(p.sum); // display sum after each turn
        }
    }
}