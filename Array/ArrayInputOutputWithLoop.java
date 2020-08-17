package basic.Array;
import java.util.Scanner;

public class ArrayInputOutputWithLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number= new double[5];
        double sum = 0;
        System.out.print("Enter Array values : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        double lenght = number.length;
        
        double average= sum/lenght;
        System.out.println("lenght of Array is :"+lenght);
        System.out.println("Sum of Array elements is :"+ sum);
        System.out.println("Average of Array elements is :" + average);
        
    }
}
