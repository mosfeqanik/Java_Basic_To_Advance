
package basic;
import java.util.Scanner;
public class Pattern21UpsAndDownPyramidExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter Line number: ");
        int n=input.nextInt();
        int result;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                result=row+64;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(" "+c);
            }
            System.out.println(" ");
        }
    }
}
