package Recursion;

// which accepts a number and adds up all the numbers from 0 to the number passed to the function.

public class RecursiveRange {

    public int recursiveRange(int num) {
        if(num <=0){
            return 0;
        }
        return num+ recursiveRange(num-1);
    }

    public static void main(String[] args) {
        RecursiveRange recursion = new RecursiveRange();
        var rec = recursion.recursiveRange(28);
        System.out.println(rec);

    }
}
