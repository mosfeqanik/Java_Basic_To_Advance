
package basic;
import java.util.Scanner;

public class ExampleWithLoop {
    
    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter m and n : ");
        m=input.nextInt();
        n=input.nextInt();
        int sum=0;
        for (int i = m ; i <  n; i++) {
            sum = sum +i;
        }
        System.out.println("the sum of 1 to 10: "+ sum );
    }
    
}
