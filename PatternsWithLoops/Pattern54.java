package basic.PatternsWithLoops;
import java.util.Scanner;
public class Pattern54 {
    
    public static void main(String[] args) {
        int Line;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Desire Line Number:  ");
        
        Line = input.nextInt();
        for (int row = 1; row <= Line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row*col);
            }
            System.out.println(" ");
        }
    }
    
}
