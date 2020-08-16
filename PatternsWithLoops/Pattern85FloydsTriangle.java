package basic.PatternsWithLoops;
import java.util.Scanner;

public class Pattern85FloydsTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number of Triangle Height : ");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int count=0;
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(++count +" ");
            }
            System.out.println(" ");
        }
    }
}
