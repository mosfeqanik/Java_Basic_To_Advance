package basic;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =input.nextInt();
        
        int sum=0,temp,r;
        
        temp=number;
        while(temp!=0){
            r =temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if (number==sum) {
            System.out.println("The number is Palindrome Number:" );
        }else{
            System.out.println("The number is not Palindrome Number:" );

        }
    }
}
