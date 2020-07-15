package basic;
import java.util.Scanner;

public class Series6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Ending number: ");
        int EndNumber = input.nextInt();
        int sum=1;
        
        for (int i = 1; i <= EndNumber ; i=i+2) {
            sum = sum*i;
            System.out.print(i+" ");
        }
        System.out.println("The multiplication of 1 to " +EndNumber+" :" +sum );
    }
}
