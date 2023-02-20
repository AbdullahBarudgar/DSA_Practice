package Recursion;

public class ReverseString {

    public String reverse(String str) {
        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        ReverseString recursion = new ReverseString();
        String str = "AbdullahBarudgar";
        var rec = recursion.reverse(str);
        System.out.println(rec);
    }
}
