package basic;
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter Line number: ");
        int n=input.nextInt();
        int result;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                result=row%2;
                System.out.print(" "+result);
            }
            System.out.println(" ");
        }
    }
}
