package Recursion;

public class ProductOfArray {

    public int productofArray(int A[], int N)
    {
        if(N < 1){
            return 1;
        }
        return A[N-1] * productofArray(A,N-1);
    }

    public static void main(String[] args) {
        ProductOfArray recursion = new ProductOfArray();
        int arr[]={2,3,4,5,6,7};
        var rec = recursion.productofArray(arr,6);
        System.out.println(rec);

    }


}
