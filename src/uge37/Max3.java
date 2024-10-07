package uge37;

public class Max3 {
    public static void main(String[] args)
    {
        int m=max(max(3,7), 11); /// Ved brug af 3 forskellige tal ( max(max)) ///
        System.out.println("max="+m);
    }
    static int max(int a, int b)
    {
        if (a>b)
            return a;
        else
            return b;
    }
}
