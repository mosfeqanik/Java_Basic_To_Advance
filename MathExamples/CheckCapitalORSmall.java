package basic.MathExamples;
import java.util.Scanner;

public class CheckCapitalORSmall {

    public static void main(String[] args) {
        char letter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Letter: ");
        letter=input.next().charAt(0);

        if (letter>='a' && letter<='z' )//a-z 
        {
            System.out.println("its a Small Letter");
        }else if(letter>='A' && letter<='Z' ){
            System.out.println("its a Capital Letter");

        }else{
            System.out.println("it is not a letter");
        }
    }
}
