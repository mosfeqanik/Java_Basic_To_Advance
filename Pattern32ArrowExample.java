package basic;
import java.util.Scanner;

public class Pattern32ArrowExample {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Line number to Draw: ");
        int line= input.nextInt();
        int result=0;
        
        for (int row = 1; row <=line; row++) {
            //for printing space 
            for (int space = 1; space <=line-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                result=row+64;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(c);
            }
            System.out.println(" ");
        }
        for (int row = line-1; row >=1; row--) {
            //for printing space 
            for (int space = 1; space <=line-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                result=row+64;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(c);
            }
            System.out.println("");
        }
    }    
}    


