package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FunctionMiddle {

    // Write a function called middle that takes a list and returns a new list that contains
    // all but the first and last elements

    public List<Integer> middle(int arr[] ,int size){
    List<Integer> list =new ArrayList<>();
    list.add(arr[0]);
    list.add(arr[4]);

    return list;
    }

    // Alternate Method

//    public static int[] middle(int[] arr) {
//        return Arrays.copyOfRange(arr, 1, arr.length-1);
//    }

    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);

        FunctionMiddle obj = new FunctionMiddle();

        System.out.print("Enter The Size Of Array : ");
        int n = ab.nextInt();

        int arr[] = new int[n];

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = ab.nextInt();
        }

         System.out.print(obj.middle(arr,n));



    }


    }

