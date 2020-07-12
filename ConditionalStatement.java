package basic;
import java.util.Scanner;
public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,large;
        System.out.print("Enter Two numbers: ");
        num1=input.nextInt();
        num2=input.nextInt();
        //ternary operator
        
        //(Condition)? 1st condition result :else result ;
        large =(num1>num2)?num1:num2;
        System.out.println("The largest number is : "+ large);
    }
    
}
