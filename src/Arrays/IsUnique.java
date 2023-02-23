package Arrays;

import java.util.Scanner;

public class IsUnique {

    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter The Size Of Array : ");
        int n = ab.nextInt();
        String str ="";
        Boolean isUnique = true;

        int arr[] = new int[n];

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = ab.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] ) {
                isUnique = false;
                str =Boolean.toString(isUnique);
                }
                else{
                    str =Boolean.toString(isUnique);
                }
            }
        }
        System.out.println(str);
    }
}

