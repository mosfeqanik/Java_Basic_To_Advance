
package basic;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter Line number: ");
        int n=input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+row);
            }
            System.out.println(" ");
        }
    }
}
