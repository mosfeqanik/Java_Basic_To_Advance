
package basic;
import java.util.Scanner;

public class Pattern31RightSidePyramidBinary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Line number:  ");
        int line=input.nextInt();
        int result; 
        for (int row = 1; row <=line; row++) {
            for (int space = 1; space <=line-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                result=row+64;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(c);
            }
            System.out.println("");
            
        }
    }
}
