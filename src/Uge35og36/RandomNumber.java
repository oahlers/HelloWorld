package Uge35og36;

public class RandomNumber {
    public static void main (String[] args) {
        //genere 3 tal tilfældige tal //
        double tal1 = Math.random();
        double tal2 = Math.random();
        double tal3 = Math.random();

        // udregn summen af de 3 tilfældige tal mellem 0-1//
        double sum = tal1 + tal2 + tal3;

        // udregn gennemsnittet af de tre tilfældige tal //
        double average = sum / 3;

        // udksriv de 3 tilfældige tal //
        System.out.println(tal1);
        System.out.println(tal2);
        System.out.println(tal3);

        //udskriv summen af de tre tilfældige tal //
        System.out.println(sum);

        //udskriv gennemsnit af de tre tilfældige tal //
        System.out.println("gennemsnit=" +average);
    }
}
