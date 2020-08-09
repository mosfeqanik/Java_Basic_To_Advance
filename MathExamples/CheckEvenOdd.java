package basic.MathExamples;

import java.util.Scanner;

public class CheckEvenOdd {
    
    public static void main(String[] args) {
        
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        number = input.nextInt();
        
        if(number%2==0){
            System.out.println(number+",This number is even");
        }
        else if(number%2!=0){
            System.out.println(number+",This number is odd");
                    
        }else{
            System.out.println("this number is zero");
        }
        
    }
}
