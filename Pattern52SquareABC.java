package basic;
import java.util.Scanner;
public class Pattern52SquareABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The lenght of a side of Square : ");
        int length=input.nextInt();
        int result=0;
        for (int row = 1; row <= length; row++) {
            for (int col = 1; col <= length; col++) {
                result =row+64;
                char c=(char)result;
                System.out.print(" "+c+" ");
            }
            System.out.println("");
        }
    }
}
