
package basic.MathExamples;

import java.util.Scanner;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();


        int mainNumber = number1 * 1000 + number2 * 100 + number3 * 10 + number4;
        System.out.println(mainNumber);
        
        int sum=0,temp,r;
        
        temp=mainNumber;
        while(temp!=0){
            r =temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if (mainNumber==sum) {
            System.out.println(1);
        }else{
            System.out.println(37);

        }
    }
}
