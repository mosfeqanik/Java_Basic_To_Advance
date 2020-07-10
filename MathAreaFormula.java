package basic;

import java.util.Scanner;

public class MathAreaFormula {
    public static void main(String[] args) {
        double lenghtOfSide,AreaOfSquare;
        double lengthOfRectngle,WidthOfRectangle,Rectangle;
        double baseoftriangle,heightoftriangle,triangle;
        double radiusofcircle,AreaOfCircle;
        //Area of Square
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lenght Of Side : ");
        lenghtOfSide = input.nextDouble();
        AreaOfSquare = lenghtOfSide * lenghtOfSide;
        System.out.println("Area of Square " + AreaOfSquare);
        
        //Area of Rectngle
        System.out.print("Enter length Of Rectngle : ");
        lengthOfRectngle = input.nextDouble();
        System.out.print("Enter Width Of Rectngle : ");
        WidthOfRectangle = input.nextDouble();
        Rectangle= lengthOfRectngle * WidthOfRectangle;
        System.out.println("Area of Rectangle = " + Rectangle);

        //Area of Triangle
        System.out.print("Enter base of triangle : ");
        baseoftriangle = input.nextDouble();
        System.out.print("Enter height of triangle : ");
        heightoftriangle = input.nextDouble();
        triangle= .5* baseoftriangle * heightoftriangle;
        System.out.println("Area of triangle = " + triangle);
        
        //Area of circle
        System.out.print("Enter radius of circle : ");
        radiusofcircle = input.nextDouble();
        AreaOfCircle = 3.1416* radiusofcircle * radiusofcircle;
        System.out.println("Area of AreaOfCircle = " + AreaOfCircle);
        
        
        
        
        
    }
}
