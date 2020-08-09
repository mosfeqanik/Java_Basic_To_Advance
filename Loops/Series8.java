package basic.Loops;
import java.util.Scanner;


public class Series8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Ending number: ");
        double EndNumber,sum;
        EndNumber = input.nextInt();
        sum=1;
        
        for (double i = 1.5; i <= EndNumber ; i=i+1) {
            sum = sum*i;
            System.out.print(i+" ");
        }
        System.out.println("The multiplication of 1.5 to " +EndNumber+" :" +sum );
    }
}
