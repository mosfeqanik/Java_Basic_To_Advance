package basic;
import java.util.Scanner;
public class JavaNestedIfExample2 {
    public static void main(String[] args) {
        int age,weight;  
        System.out.print("Enter your age and weight:");
        Scanner input=new Scanner(System.in);
        age=input.nextInt();
        weight=input.nextInt();
         if(age>=18){      
            if(weight>50){    
                System.out.println("You are eligible to donate blood");    
            } else{  
                System.out.println("You are not eligible to donate blood");    
            }  
        } else{  
            System.out.println("Age must be greater than 18");  
            }  
    }
}
