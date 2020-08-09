package basic.BasicSyntax;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = input.nextInt();
        System.out.println("number " + num);
        if(num > 0){
            System.out.println(num + ",The number is positive");
        }
        else if(num < 0){
            System.out.println(num + ",The number is negative");
        }else{
            System.out.println("this number is zero ");
        }
        
    }
}
