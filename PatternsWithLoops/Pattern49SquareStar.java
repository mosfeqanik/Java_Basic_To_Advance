package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern49SquareStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The lenght of a side of Square : ");
        int length=input.nextInt();
        
        for (int row = 1; row <= length; row++) {
            for (int col = 1; col <= length; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    
}
