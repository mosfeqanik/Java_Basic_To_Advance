package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern24ArrowExample {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Arrow size: ");
            int size=input.nextInt();
            
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <=row ; col++) {
                    System.out.print(""+col);
                }
                System.out.println(" ");
            }
            for (int row = size-1; row >= 1; row--) {
                for (int col = 1; col <=row ; col++) {
                    System.out.print(""+col);
                }
                System.out.println(" ");
            }
        }
}
