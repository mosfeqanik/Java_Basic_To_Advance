package basic.BasicSyntax;

import java.util.Scanner;


public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String name;
        System.out.print("Enter your name :");
        name=input.next();
        System.out.println("Name Example with next() " + name);
        name=input.nextLine();
        System.out.println("Name Example with nextLine() " + name);
        System.out.print("Enter the number :");
        number = input.nextInt();
        System.out.println("Number is "+number);
                
    }
    
}
