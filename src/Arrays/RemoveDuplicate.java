package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicates(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        return list;
    }

    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);

        RemoveDuplicate obj = new RemoveDuplicate();

        System.out.print("\nEnter The Array : ");
        int n = ab.nextInt();

        int ar[] = new int[n];

        List<Integer> arr = new ArrayList<Integer>();

        System.out.print("\nEnter The Array : ");
        for (int i = 0; i < n; i++) {
            ar[i] = ab.nextInt();
            arr.add(ar[i]);
        }
        System.out.println(obj.removeDuplicates(arr).toString());

    }
}



