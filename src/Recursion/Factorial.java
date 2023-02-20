package Recursion;

public class Factorial {

    public int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num *factorial(num-1);
    }
        public static void main(String[] args) {
            Factorial recursion = new Factorial();
            var rec = recursion.factorial(5);
            System.out.println(rec);

        }
    }

