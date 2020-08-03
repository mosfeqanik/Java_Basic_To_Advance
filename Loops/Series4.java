package basic;
import java.util.Scanner;


public class Series4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Ending number: ");
        double EndNumber,sum;
        EndNumber = input.nextInt();
        sum=0;
        
        for (double i = 1.5; i <= EndNumber ; i=i+1) {
            sum = sum+i;
            System.out.print(i+" ");
        }
        System.out.println("The sum of 1.5 to " +EndNumber+" :" +sum );
    }
}
