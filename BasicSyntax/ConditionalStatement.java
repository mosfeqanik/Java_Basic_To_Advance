package basic.BasicSyntax;
import java.util.Scanner;
public class ConditionalStatement {

    public static void main(String[] args) {
        /*
        if (expression) {
        // body: do something
        }   */
        int age = 120; // it has a value
        if (age > 100) {
            System.out.println("Very experienced person");
        }

        boolean b = true; // it is true or false
        if (b) { // or !b
            // do something
            System.out.println("it is true");

        }

        long dollars = 200_000; // your budget

        if (dollars < 1000) {
            System.out.println("Buy a laptop");
        } else if (dollars < 2000) {
            System.out.println("Buy a personal computer");
        } else if (dollars < 100_000) {
            System.out.println("Buy a server");
        } else {
            System.out.println("Buy a data center or a quantum computer");
        }

        
        
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
