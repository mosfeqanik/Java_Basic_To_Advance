package basic.Array;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number= new double[5];
        System.out.print("Enter Array values : ");
        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();
        
        double lenght = number.length;
        double sum = number[0]+ number[1] + number[2]+ number[3]+number[4];
        double average= sum/lenght;
        System.out.println("lenght of Array is :"+lenght);
        System.out.println("Sum of Array elements is :"+ sum);
        System.out.println("Average of Array elements is :" + average);
        
    }
}
