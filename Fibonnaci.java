package basic;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        //Fibonnaci without Recursion
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many Number you need for Fibonnaci Series ");
        int EndingPoint=input.nextInt();
        int FirstNumber=0;
        int SecondNumber=1;
        int fibo;
        System.out.print(FirstNumber+" "+SecondNumber);
        for (int i = 3; i <= EndingPoint; i++) {
            fibo = FirstNumber + SecondNumber;
            System.out.print(" "+fibo+" ");
            FirstNumber = SecondNumber ;
            SecondNumber = fibo;
        }
    
    
    
    
    }
}
