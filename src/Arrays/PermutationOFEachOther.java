package Arrays;

import java.util.Scanner;

public class PermutationOFEachOther {

    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        int sum1 = 0,sum2=0;
        int mul1 =1 ,mul2=1;
        Boolean isPermuatation = false;

        System.out.print("Enter The Size Of Array 1 : ");
        int n = ab.nextInt();
        int arr1[] = new int[n];


        System.out.print("Enter The Size Of Array 2 : ");
        int x = ab.nextInt();
        int arr2[] = new int[x];

        System.out.print("\nEnter The Array 1 : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = ab.nextInt();
        }

        System.out.print("\nEnter The Array 2 : ");
        for (int i = 0; i < x; i++) {
            arr2[i] = ab.nextInt();
        }



        if(n != x){
            isPermuatation =false;
        }
        else{

        for (int i = 0; i < arr1.length; i++) {
         sum1+=arr1[i];
         mul1*=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
                sum2+=arr2[i];
                mul2*=arr2[i];
            }

        if(sum1==sum2 && mul1 == mul2) {
            isPermuatation = true;
        }


            }
        System.out.println("\nisPermuatation is: "+isPermuatation.toString() );

    }

    }

