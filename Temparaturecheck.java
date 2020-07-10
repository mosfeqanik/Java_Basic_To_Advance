package basic;

import java.util.Scanner;

public class Temparaturecheck {

    public static void main(String[] args) {
        
        double celsius,Fahrenheit;
        Scanner input = new Scanner(System.in); 
        
        
        System.out.print("Enter celsius data = ");
        celsius = input.nextDouble();
        
        Fahrenheit = 1.8*celsius + 32;
        System.out.println("Fahrenheit = "+Fahrenheit);
        
        System.out.print("Enter Fahrenheit data = ");
        Fahrenheit=input.nextDouble();
        
        celsius=0.56*(Fahrenheit-32);
        System.out.println("celsius = "+celsius);

    }
    
}
