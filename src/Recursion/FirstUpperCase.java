package Recursion;

public class FirstUpperCase {

    public static char first(String str) {
        if (str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        } else {
            return first(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        FirstUpperCase recursion = new FirstUpperCase();
        String str1 = "abdullahBarudgR";
        var rec = recursion.first(str1);
        System.out.println(rec);
    }
}
