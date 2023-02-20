package Recursion;
// which accepts a number and returns the nth number in the Fibonacci sequence.
// Recall that the Fibonacci sequence is the sequence of whole numbers 0,1, 1, 2, 3, 5, 8, ...
// which starts with 0 and 1, and where every number thereafter is equal to the sum of the
// previous two numbers.

public class Fibonacci {

        public static void main(String[] args) {
            Fibonacci recursion = new Fibonacci();
            var rec = recursion.fibonacci(10);
            System.out.println(rec);

        }

        public int fibonacci(int n) {
            if (n<0) {
                return -1;
            }
            if (n==0 || n==1) {
                return n;
            }
            return fibonacci(n-1) + fibonacci(n-2);
        }



    }

