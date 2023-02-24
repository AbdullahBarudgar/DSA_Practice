package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumDiagonal {

    // 2D array calculate the sum of diagonal elements.

    public int sumD(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);

        sumDiagonal obj = new sumDiagonal();

        System.out.print("Enter The Size Of Array : ");
        int n = ab.nextInt();

        int arr[][] = new int[n][n];

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ab.nextInt();
            }
        }
        System.out.println("\n"+Arrays.deepToString(arr));

        int result= obj.sumD(arr);

        System.out.print("\nSum of diagonal :"+result);
    }
}
