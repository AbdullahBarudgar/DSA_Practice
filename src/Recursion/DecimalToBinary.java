package Recursion;

public class DecimalToBinary {

public static  int dtb(int n){

if(n==0){
return 0;
}
    if(n==1){
        return 1;
    }
if(n<-1){
return -1;
}
return n%2 +10*dtb(n/2);
}
    public static void main(String[] args) {
        DecimalToBinary recursion = new DecimalToBinary();
        var rec = recursion.dtb(120);
        System.out.println(rec);
}
}