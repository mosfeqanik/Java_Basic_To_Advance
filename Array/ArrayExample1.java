package basic.Array;

import java.util.Scanner;

public class ArrayExample1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = input.nextInt();
        int[][] number = new int[row][5];
        int k = 0;

        //assigning value to array 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 5; j++) {
                number[i][j] = k;
                k++;
            }
        }

        //printing value from the array
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
