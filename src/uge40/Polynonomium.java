package uge40;

import java.util.ArrayList;

public class Polynonomium {
    public static void main(String[] args) {
        ArrayList<Polynomium> list=new ArrayList<>();
        list.add(new FP(3,2));
        list.add(new AP(2,2,3));


        for (Polynomium p:list) {
            System.out.println(p);
            System.out.println("\t Førstegradspolynomium x="+p.f(9));
            System.out.println("\t Andengradspolynomium x="+p.f(8));
        }
    }
}

abstract class Polynomium {
    abstract double f(double x);
}

class FP extends Polynomium {
    int a;
    int b;

    FP(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double f(double x) {
        return a * x + b;
    }

    public String toString() {
        return "Førstegradspolynomium (" + a + "," + b + ")";
    }
    }

    class AP extends Polynomium {
        int a;
        int b;
        int c;

        AP(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    double f(double x) {
        return a * x * x + b * x + c;
    }

    public String toString() {
        return "Andengradspolynomium (" + a + "," + b + ", " + c + ")";
    }
}
