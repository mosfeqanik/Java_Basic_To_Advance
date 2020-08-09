package basic.MathRelated;
import java.util.Scanner;
public class MathClassUsage {
    public static void main(String[] args) {
        int x,y,a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        x = input.nextInt();
        y = input.nextInt();
        
        System.out.println("max between "+x+" and "+y+ " "+Math.max(x, y));
        System.out.println("min between "+x+" and "+y+ " "+Math.min(x,y));
        
        System.out.print("Enter A negative Number to get a absolute number: ");
        a = input.nextInt();
        int absolute = Math.abs(a);
        System.out.println(absolute);
        
        System.out.print("Enter a desire power number :");
        double powernumber= input.nextInt();
        double basenumber = input.nextInt();
        
        double power= Math.pow(powernumber, basenumber);
        System.out.println( basenumber +" to the power of "+ powernumber +" : "+ power);
        
        System.out.print("Enter a Decimal number : ");
        double number=input.nextDouble();
        double floorResult=Math.floor(number);
        System.out.println("floor result of decimal number is: "+floorResult);
                
        double pi =Math.PI;
        System.out.println("PI resuSlt : "+pi);

    
    }
}
