package Recursion;

public class GCD {

    public static void main(String[] args) {
        GCD recursion = new GCD();
        var rec = recursion.gcd(48,18);
        System.out.println(rec);
    }

    public static int gcd(int n,int a){

      if(a==0) {
      return n;
      }
      if(a<0 || n<0){
      return -1;
        }
        return  gcd(a,n%a) ;
    }
}
