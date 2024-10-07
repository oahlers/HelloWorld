package uge38;

import java.io.FileReader;
import java.io.*; // hvis man laver *, så importere den samtlige filer //
import java.util.ArrayList;

public class StudentList
{
    public static void main(String[] arg) throws IOException {
        FileReader fil = new FileReader("src//uge38//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> list = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null)  // Måde hvorpå man ser om der er mere i filen //
        {
            String[] bidder = linje.split(","); // opdel i bidder efter komma //
            String navn = bidder[1];
            list.add(navn);
            linje = ind.readLine();
        }
        list.sort(null);            // Sortere efter alfabetisk-orden (indbygget rangorden //
        for (String s : list)
            System.out.println(s);
        {
            save(list);
        }
    }
    static void save(ArrayList<String> l) throws IOException
    {
        FileWriter fil= new FileWriter("src//uge38//StudentListSorted.txt");
        PrintWriter ud=new PrintWriter(fil);
           for (String s : l)
           {
               ud.println(s);
           }
           ud.close();           // sørger for at lukke filen og sikre at alt data er med //
    }
}
