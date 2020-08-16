package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern84XShapewithStar {
    public static void main(String[] args) {
        System.out.print("Enter the Height of X shape: ");
        Scanner input = new Scanner(System.in);
        int height =input.nextInt();
        
        for (int row = 1; row <=height; row++) {
            for (int col = 1; col <= height; col++) {
                if (col==row||row+col==height+1) {
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
