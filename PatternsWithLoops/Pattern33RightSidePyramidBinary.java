package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern33RightSidePyramidBinary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Line number:  ");
        int line=input.nextInt();
        int result; 
        for (int row = 1; row <=line; row++) {
            for (int space = 1; space <=line-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                result=row%2;
                System.out.print(result);
            }
            System.out.println("");
            
        }
    }
}
