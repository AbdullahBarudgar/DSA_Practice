package Arrays;

import java.util.Scanner;

public class PairsOfSumEqualToNumber {

    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter The Size Of Array : ");
        int n = ab.nextInt();
        int arr[] = new int[n];

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = ab.nextInt();
        }
        System.out.print("\nEnter The Number : ");
        int x = ab.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1 ; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                }
            }
        }

    }
}
