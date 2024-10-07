package uge37;

public class Gennemsnit {
    public static void main(String[] args) {
        double ialt;
        ialt = sum(1, 2, 3, 4);
        System.out.println(ialt);
        int a = 7;
        int b = 3;
        int c = 5;
        int d = 12;
        ialt = sum(a, b, c, d);

        System.out.println(ialt);
    }

    static double sum(int x, int y, int z, int t)
    {
        double result = (double)(x + y + z + t)/4;  ///du kan skrive (double) hvis du skal have resultatet
        return result;
    }
}
