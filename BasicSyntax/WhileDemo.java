/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.BasicSyntax;

/**
 *
 * @author MN
 */
public class WhileDemo {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter+" ");
            letter++;
        }
    }
}
