package Arrays;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = ab.nextInt();
        int[] temps = new int[numDays];
        // record temperatures and find average
        int sum = 0;
        for (int i=0; i<numDays; i++) {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temps[i] = ab.nextInt();
            sum += temps[i];
        }

        double average = sum / numDays;
        // count days above average
        int above = 0;
        for (int i=0; i<temps.length; i++) {
            if (temps[i]>average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " days above average");

}}
