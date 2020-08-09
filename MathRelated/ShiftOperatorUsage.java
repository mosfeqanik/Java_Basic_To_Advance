
package basic.MathRelated;

public class ShiftOperatorUsage {

    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        
        int c;
        c = a<<3;    
        //Left Shift Operator Example
        //3 means 2 X 2 X 2 diye Multipication
        System.out.println("a <<3 :" +c);
        System.out.println(10<<2);//10*2^2=10*4=40  
        System.out.println(10<<3);//10*2^3=10*8=80  
        System.out.println(20<<2);//20*2^2=20*4=80  
        System.out.println(15<<4);//15*2^4=15*16=240
        
        c = a>>3;    
        //Left Shift Operator Example
        //3 means 2 X 2 X 2 diye Divide
        System.out.println("a >>3 :" +c);
        System.out.println(10>>2);//10/2^2=10/4=2  
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2  
        
    }
    
}
