package basic;
import java.util.Scanner;
public class Pattern50Square123 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The lenght of a side of Square : ");
        int length=input.nextInt();
        
        for (int row = 1; row <= length; row++) {
            for (int col = 1; col <= length; col++) {
                System.out.print(" "+row+" ");
            }
            System.out.println("");
        }
    }
}
