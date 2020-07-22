
package basic;
import java.util.Scanner;
public class Pattern16UpsAndDownPyramidExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Line number ");
        int line =input.nextInt() ;
       for (int row = line; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println(" ");
        }  
    
    }
}
