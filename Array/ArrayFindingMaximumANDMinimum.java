package basic.Array;

import java.util.Scanner;

public class ArrayFindingMaximumANDMinimum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array numbers : ");

        double sum = 0;
        double[] numbers = new double[5];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        for (int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double max = numbers[0];
        double min = numbers[1];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        double length = numbers.length;
        double average = sum / length;

        System.out.println("lenght of Array is :" + length);
        System.out.println("Sum of Array elements is :" + sum);
        System.out.println("Max of Array elements is :" + max);
        System.out.println("min of Array elements is :" + min);
        System.out.println("Average of Array elements is :" + average);

    }
}
