package basic.Loops;
import java.util.Scanner;


public class SeriesPowerMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Ending number: ");
        int EndNumber,sum;
        EndNumber = input.nextInt();
        sum=1;
        
        for (int i = 1; i <= EndNumber ; i=i+1) {
            sum = sum*(i*i);
            System.out.print(" "+i+"*"+i+" ");
        }
        System.out.println("The sum of 1^1 to " +EndNumber+" :" +sum );
    }
}
