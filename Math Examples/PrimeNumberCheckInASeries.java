
package basic;
import java.util.Scanner;
public class PrimeNumberCheckInASeries {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Intial Number ");
        int Intial=input.nextInt();
        //to check this number is prime number is not or is with Series
        System.out.print("Enter a Ending Number ");
        int Ending=input.nextInt();
        int count=0,TotalPrimeNumber=0;
        for (int i = Intial; i <= Ending; i++) {
            for (int j = 2; j <= i-1; j++) {
                if (i%j==0) {
                count++;
                break;
                }
            }
            if (count==0) {
                System.out.print(" "+i+" ");
                TotalPrimeNumber++;
            }
            
            count =0;
        }
        System.out.println("Total Prime Numbers"+TotalPrimeNumber);
        
    }
}
