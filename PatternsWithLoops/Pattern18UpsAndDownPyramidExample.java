
package basic.PatternsWithLoops;
import java.util.Scanner;


public class Pattern18UpsAndDownPyramidExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line number :");
        int n=input.nextInt();
        
        int result;
        for (int row = n; row >=1 ; row--) {
            for (int col = 1; col <= row; col++) {
                result=col%2;
                System.out.print(" "+result);
            }
            System.out.println(" ");
        }
    }
}
