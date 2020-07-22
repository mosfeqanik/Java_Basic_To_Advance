package basic;
import java.util.Scanner;

public class Pattern15PyramidExample {
   public static void main(String[] args) {  
       Scanner input = new Scanner(System.in);
       System.out.print("Enter A number : ");
       int n=input.nextInt();
       
        for(int i=1;i<=n;i++){  
            for(int j=1;j<=i;j++){  
                System.out.print("#"); 
            }  
        System.out.println();//new line  
        }
    }  
}
