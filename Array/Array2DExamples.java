package basic.Array;

public class Array2DExamples {
    public static void main(String[] args) {
        
        //[2] = Row
        //[3] = col
        //2D array is matrix
        int[][] number = new int[2][3];
        
        number[0][0]= 10;
        number[0][1]= 20;
        number[0][2]= 30;
        number[1][0]= 40;
        number[1][1]= 50;
        number[1][2]= 60;        
        
        System.out.println(number[0][0]);
        System.out.println(number[0][1]);
        System.out.println(number[0][2]);
        System.out.println(number[1][0]);
        System.out.println(number[1][1]);
        System.out.println(number[1][2]);
        
        int length=number.length;
        System.out.println("length of the array: " +length);
     
        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < 3; col++) {
                
                System.out.print(number[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
