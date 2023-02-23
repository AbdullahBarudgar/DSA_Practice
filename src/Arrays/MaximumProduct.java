package Arrays;

import java.util.Scanner;

public class MaximumProduct {

    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter The Size Of Array : ");
        int n = ab.nextInt();
        int max = 0;
        String str = "";

        int arr[] = new int[n];

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = ab.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] * arr[j] > max) {
                    max = arr[i] * arr[j];
                    str = Integer.toString(arr[i]) +" * "+ Integer.toString(arr[j]) ;
                }
            }
        }
        System.out.println("Maximum Product is "+ str+" = "+max);
    }
}

