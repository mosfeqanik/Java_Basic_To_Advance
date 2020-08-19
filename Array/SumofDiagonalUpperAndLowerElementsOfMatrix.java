package basic.Array;
import java.util.Scanner;

public class SumofDiagonalUpperAndLowerElementsOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumofDiagonal =0;
        int Sumoftopper = 0;
        int Sumoflower = 0;
        System.out.println("Enter the elements of Matrix: ");
        
        //Getting Matrix elements
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col]= input.nextInt();
            }
        }
        System.out.println("\n \n");
        //Printing Matrix elements
        System.out.println("Matrix = ");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print ("\t "+ A[row][col]);
            }
            System.out.println(" ");

        }
        //Sum of Diagonal Sum of upper sum of lower
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                if (row==col) {
                    SumofDiagonal =SumofDiagonal+A[row][col]; 
                }
                if (row<col) {
                    Sumoftopper=Sumoftopper+A[row][col];
                }
                if (row>col) {
                    Sumoflower=Sumoflower+A[row][col];
                }
                
                
            }
            System.out.println(" ");

        }
        System.out.println("Sum of Diagonal matrix : "+SumofDiagonal);
        System.out.println("Sum of topper  matrix : "+Sumoftopper);
        System.out.println("Sum of lower matrix : "+Sumoflower);
        
        
        
    }
}
