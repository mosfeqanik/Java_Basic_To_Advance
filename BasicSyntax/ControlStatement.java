package basic.BasicSyntax;

import java.util.Scanner;

public class ControlStatement {

    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = input.nextInt();
        System.out.println("number " + num);

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

        //even or number
        if (num > 0) {
            System.out.println(num + ",The number is positive");
        } else if (num < 0) {
            System.out.println(num + ",The number is negative");
        } else {
            System.out.println("this number is zero ");
        }

    }
}
