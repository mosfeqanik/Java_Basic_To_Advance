package basic.PatternsWithLoops;
import java.util.Scanner ;

public class Pyramid67withStar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Desire Line number: ");
        int line= input.nextInt();
        
        for (int row = 1; row <=line; row++) {
            for (int col =1; col <=line-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row-1; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }  
    }
}

