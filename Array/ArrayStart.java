package basic.Array;

public class ArrayStart {
    public static void main(String[] args) {
        
        int[] number; //Declaration
        number = new int[5]; //initialization
        
        
        number[0]=10;
        number[1]=20;
        number[2]=50;
        number[3]=40;
        number[4]=30;
      
        int sum = number[0] + number[1]+number[2]+number[3]+number[4];
        
        System.out.println("sum = "+sum);
        int[] number1 = new int[5];
        number1[0]=12;
        number1[1]=21;
        number1[2]=52;
        number1[3]=41;
        number1[4]=32;
        
        int sum1 = number1[0] + number1[1]+number1[2]+number1[3]+number1[4];
        System.out.println("sum1 = " +sum1);
        
        
        
        
    }
    
}
