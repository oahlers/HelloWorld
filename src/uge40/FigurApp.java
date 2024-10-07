package uge40;

import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
        ArrayList<Figur> list=new ArrayList<>();
        list.add(new Rektangel(3,7));
        list.add(new Punkt());
        list.add(new Cirkel(3));
        list.add(new Cirkel(7));
        list.add(new Linje(5));

        for (Figur f:list) {
            System.out.println(f);
            System.out.println("\t areal="+f.beregnAreal());
            System.out.println("\t omkreds="+f.beregnOmkreds());
        }
    }
}

abstract class Figur {
    abstract double beregnAreal();
    abstract double beregnOmkreds();
}

class Punkt extends Figur {
    double beregnAreal() {
        return 0;
    }
    double beregnOmkreds(){
        return 0;
    }
}

class Linje extends Figur {
    double l;
    Linje(double l) {
        this.l=l;
    }
        double beregnAreal() {
            return 0;
        }
        double beregnOmkreds() {
            return 2*l;
        }
    }

class Cirkel extends Figur {
    double r;

    Cirkel(double r){
        this.r=r;
    }
   double beregnAreal(){
       return Math.PI*r*r;
    }
   double beregnOmkreds() {
       return 2*Math.PI*r;
    }
    public String toString() {
       return "Cirkel r="+r;
    }
}

class Rektangel extends Figur {
    double h;    // højde //
    double b;    // bredde //
    Rektangel (double h, double b) {
        this.h=h;
        this.b=b;
    }
    double beregnAreal() {
        return h*b;
    }
    double beregnOmkreds() {
        return 2*(h+b);
    }
    public String toString(){
        return "Rektangel ("+h+","+b+")";
    }
}