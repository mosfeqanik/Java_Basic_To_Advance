package basic;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: 4");
        int n = input.nextInt();
        int fact =1;
        for (int i = n; i >= 1; i--) {
            fact = fact* i;
        }            
        System.out.println("the factorial of "+ n +" is :"+fact);

    }
}
