package basic.MathRelated;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year=input.nextInt();
        //Leap year kina bujhar main upai 4 diya vag jabe and 100 vag jabe na
        // ba 400 vag jabe valo 
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("LEAP YEAR");  
        }  
        else{  
            System.out.println("COMMON YEAR");  
        }
        
    }
}
