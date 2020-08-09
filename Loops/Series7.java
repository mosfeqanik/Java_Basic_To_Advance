package basic.Loops;
import java.util.Scanner;

public class Series7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Ending number: ");
        int EndNumber = input.nextInt();
        int sum=1;
        
        for (int i = 2; i <= EndNumber ; i=i+2) {
            //even
            sum = sum*i;
            System.out.print(i+" ");
        }
        System.out.println("The multiplication of 2 to " +EndNumber+" :" +sum );
    }
}
