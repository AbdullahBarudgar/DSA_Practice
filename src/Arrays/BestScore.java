package Arrays;

import java.util.*;

public class BestScore {

    //Given an array, write a function to get first, second best scores from the array.
    //Array may contain duplicates.

    static String bestScore(Integer[] myArray) {
        Integer[] ar = myArray;

        Arrays.sort(ar, Collections.reverseOrder());

        int first = ar[0];
        Integer second = null;
        for (int i=0; i<ar.length; i++) {
            if (ar[i] != first) {
                second = ar[i];
                break;
            }
        }
        return first+" "+second;

    }




    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);

        BestScore obj = new BestScore();

        System.out.print("Enter The Size Of Array : ");
        int n = ab.nextInt();

        Integer[] arr = new Integer[n];

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = ab.nextInt();
        }

        System.out.print(obj.bestScore(arr));



    }


}

