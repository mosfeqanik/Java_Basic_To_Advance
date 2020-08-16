package basic.PatternsWithLoops;
import java.util.Scanner;


public class Pattern82SquarewithStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter line number: ");
        int line =input.nextInt();
        
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= line; col++) {
                if (row==1||row==line||col==1||col==line) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
