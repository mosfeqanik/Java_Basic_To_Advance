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
public class IncrementingVariable {
    public static void main(String[] args){
        int i = 3;
        i++;

        // prints 4
        System.out.println(i);
        ++i;

        // prints 5
        System.out.println(i);

        // prints 6
        System.out.println(++i);

        // prints 6
        System.out.println(i++);

        // prints 7
        System.out.println(i);
    }
}
