package basic.PatternsWithLoops;
import java.util.Scanner ;

public class Pattern71RhombusPatternwithABC {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Desire Line number: ");
        int line= input.nextInt();
        
        for (int row = 1; row <=line; row++) {
            for (int col =1; col <=line-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                int result=row+64;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(c);               
            }
            System.out.println(" ");
        }
        for (int row = line-1; row >=1; row--) {
            for (int col =1; col <=line-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                int result=row+64;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(c);  
            }
            System.out.println(" ");
        }
        
    }
    
    
    
    
    
}



