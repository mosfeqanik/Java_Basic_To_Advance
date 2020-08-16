package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern83TrianglewithStar {
    public static void main(String[] args) {
        System.out.print("Enter the height of triangle:");
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= line; col++) {
                if (col==1 || row==line || row==col) {
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
