package Recursion;

public class Power {

    public static int power(int n , int p) {
        if (p < 0) {
            return -1;
        }
        if (p == 1) {
            return n;
        }

        if (p == 0) {
            return 1;
        }
        int result = n*power(n,p-1);
        return result;
    }

    public static void main(String[] args) {
        Power recursion = new Power();
        var rec = recursion.power(2,4);
        System.out.println(rec);
    }
}
