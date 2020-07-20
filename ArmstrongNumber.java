package basic;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int sum=0,temp,num,r;
        num = input.nextInt();
        
        temp=num;
        while(temp!=0){
            r =temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("The number is Armstrong Number:" );
        }else{
            System.out.println("The number is not Armstrong Number:" );
        }
        
        
        
        
    }
}
