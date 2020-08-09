package basic.MathRelated;
import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number1,number2,result;
        System.out.print("Enter your First number : ");
        number1=input.nextInt();
        System.out.print("Enter your Secoond number : ");
        number2=input.nextInt();
        result=number1+number2;
        System.out.println("Result of Sum "+ result);
        result=number1-number2;
        System.out.println("Result of Sub "+ result);
        result=number1/number2;
        System.out.println("Result of quotient "+ result);
        result=number1*number2;
        System.out.println("Result of multiply "+ result);
        result=number1%number2;
        System.out.println("Result of Remainder "+ result);


    }
}
