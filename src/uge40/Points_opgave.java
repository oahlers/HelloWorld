package uge40;

import java.util.ArrayList;
import java.util.Random;

public class Points_opgave {
    public static void main(String[] args) {
        ArrayList<Point> list=new ArrayList<>();
        Random r=new Random();
        int xsum=0;
        int ysum=0;
        int xmax=0;
        int ymax=0;
        int xmin=0;
        int ymin=0;
        for (int i = 0; i <10 ; i++) {
            list.add(new Point(r.nextInt(), r.nextInt()));
            xsum+=list.getLast().x;
            ysum+=list.getLast().y;

            xmax=Math.max(xmax,list.getLast().x);
            ymax=Math.max(ymax,list.getLast().y);
            xmin=Math.min(xmin,list.getLast().x);
            ymin=Math.min(ymin,list.getLast().y);
        }
        xsum/=10;
        ysum/=10;
        System.out.println(xsum+", "+ysum);
        System.out.println(xmax+" "+ymax+" "+xmin+" "+ymin);

        /*Point p,p2;
        p=new Point(10,2);
        p2=new Point(4,7);

        double d=p.afstand(p2);

         */

    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y =y;

        }

        double afstand(Point p2)
        {
            int tempX=(p2.x - this.x);
            int tempY=(p2.y - this.y);
            double d = Math.sqrt((tempX*tempX) + (tempY*tempY));
            return d;
        }
    }
}

