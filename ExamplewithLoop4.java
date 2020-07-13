package basic;
import java.util.Scanner;

public class ExamplewithLoop4 {
    
    public static void main(String[] args) {
        int m,n;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter m and n : ");
        m=input.nextInt();
        n=input.nextInt();
        int sum=0;
        for (int i = m ; i <  n; i++) {
            if (i%2!=0) {
                //Odd
                sum = sum +i;            
            }
        }
        System.out.println("the sum of 1 to 10: "+ sum );
    }
   
        
}
