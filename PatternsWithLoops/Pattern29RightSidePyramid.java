package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern29RightSidePyramid {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Line number: ");
        int line=input.nextInt();
        
        for (int row = 1; row <=line; row++) {
            //for printing space 
            for (int space = 1; space <=line-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println(" ");
        }
    }
}
