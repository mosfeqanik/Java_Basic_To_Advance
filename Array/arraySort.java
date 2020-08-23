package basic.Array;

import java.util.Arrays;

public class arraySort {

    public static void main(String[] args) {
        int[] number = {10, -3, 3, 233, 354, 67, 29};

        Arrays.sort(number);
        //printing Asscending number 
        System.out.println("Asscending number");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println("");
        System.out.println("array lenght: "+ number.length);
        //printing deascending
        System.out.println("deascending number");

        for (int i = number.length - 1; i > 0; i--) {
            System.out.print(number[i] + " ");
        }
        String [] names = {"lotif","anik","abdib","aadat","afrani","fancy"};
        Arrays.sort(names);
        
        System.out.println("");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("");
        for (String x:names) {
             System.out.print(x + " ");
        }
        for (int i = names.length-1; i >0 ; i--) {
            System.out.print(names[i] + " ");
        }
    }
}
