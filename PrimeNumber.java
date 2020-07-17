package basic;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Any Positive Integer ");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        //to check this number is prime number is not or is
        int count=0;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println("Prime Number");
        }else{
            System.out.println("not Prime number");
        }
    }
}
