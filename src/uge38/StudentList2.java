package uge38;

import java.io.*;
import java.util.ArrayList;

public class StudentList2
{
    public static void main(String[] arg) throws IOException {
        FileReader fil = new FileReader("src//uge38//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<Student> list = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null)  // Måde hvorpå man ser om der er mere i filen //
        {
            String[] bidder = linje.split(","); // opdel i bidder efter komma //
            Student s=new Student();
            s.name =bidder[1];
            s.surName=bidder[2];
            s.sNo=bidder[0].substring(0,8); //substring(x,y) = tager bogstav x-y //
            list.add(s);
            linje = ind.readLine();
        }
        list.sort(null);            // Sortere efter alfabetisk-orden (indbygget rangorden //
        for (Student e : list)
            System.out.println(e);
        save(list);
    }
    static void save(ArrayList<Student> l) throws IOException
    {
        FileWriter fil= new FileWriter("src//uge38//StudentListSorted2.txt");
        PrintWriter ud=new PrintWriter(fil);
           for (Student s : l)
           {
               ud.println(s);
           }
           ud.close();           // sørger for at lukke filen og sikre at alt data er med //
    }
}
class Student implements Comparable<Student>
{
    String name;
    String surName;
    String sNo;

    public String toString() {
        return sNo + ": " + name + " " + surName;
    }

    @Override
    public int compareTo(Student o)
    {
        return sNo.compareTo(o.sNo);
    }
}