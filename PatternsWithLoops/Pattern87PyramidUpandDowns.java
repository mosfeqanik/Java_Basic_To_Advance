package basic.PatternsWithLoops;
import java.util.Scanner;
public class Pattern87PyramidUpandDowns {
    public static void main(String[] args) {
        System.out.print("Enter the number of height of the pyramid: ");
        Scanner input = new Scanner(System.in);
        int height=input.nextInt();
        
        for (int row = height; row >=1; row--) {
            for (int col = 1; col <= height-row ; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int col = row-1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
