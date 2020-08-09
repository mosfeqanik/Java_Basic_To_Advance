package basic.PatternsWithLoops;
import java.util.Scanner ;

public class Pattern64PyramidUpandDownwith123 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Desire Line number: ");
        int line= input.nextInt();
        
        for (int row = line; row >=1; row--) {
            for (int col =line-row; col >=1; col--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=2*row-1; col++) {
                System.out.print(col);
            }
            System.out.println(" ");
        }
        
    }
    
    
    
    
    
}

