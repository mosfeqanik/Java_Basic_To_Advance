/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.util.Scanner;
/**
 *
 * @author MN
 */
public class Pattern10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter Line number: ");
        int n=input.nextInt();
        int result;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                result=col+96;
                //result of integar  then convert to charecter
                char c=(char)result;
                System.out.print(" "+c);
            }
            System.out.println(" ");
        }
        
    }
}
