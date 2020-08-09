package basic.Loops;
import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Desire number TIME TABLE ");
        int n=input.nextInt();
        int multipication;
        for (int i = 1; i <= 10; i++) {
            multipication=i*n;
            System.out.println(n +"X"+ i+"="+multipication);
        }
        
    }
}
