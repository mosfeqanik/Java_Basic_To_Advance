package basic.PatternsWithLoops;
import java.util.Scanner ;

public class Pattern79Diamondwith123 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Desire Line number: ");
        int line= input.nextInt();
        
        for (int row = 1; row <=line; row++) {
            for (int col =1; col <=line-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" "); 
            }
            System.out.println(" ");
        } 
        for (int row = line-1; row >=1; row--) {
            for (int col = 1; col <=line-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");  
            }
            System.out.println(" ");
        }  
    }
}



