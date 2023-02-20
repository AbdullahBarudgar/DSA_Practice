package Recursion;

public class SumOFPositiveInteger {

public static int sumFunction(int n){

if(n<0){
return -1;
}
    if(n>0 && n<=9){
        return n;
    }
return  n%10 + sumFunction(n/10);
}

    public static void main(String[] args) {
        SumOFPositiveInteger recursion = new SumOFPositiveInteger();
        var rec = recursion.sumFunction(546);
        System.out.println(rec);

    }
}
