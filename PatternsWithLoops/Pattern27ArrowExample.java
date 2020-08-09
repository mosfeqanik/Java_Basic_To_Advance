package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern27ArrowExample {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Arrow size: ");
            int size=input.nextInt();
            int result;
            
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <=row ; col++) {
                    result=row+64;
                //result of integar  then convert to charecter
                    char c=(char)result;
                    System.out.print(""+c);
                }
                System.out.println(" ");
            }
            for (int row = size-1; row >= 1; row--) {
                for (int col = 1; col <=row ; col++) {
                    result=row+64;
                    //result of integar  then convert to charecter
                    char c=(char)result;
                    System.out.print(""+c);
                }
                System.out.println(" ");
            }
        }
}
