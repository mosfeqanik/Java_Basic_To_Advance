
package variableexercise;

public class VariableExercise {
    public static void main(String[] args) {
        int inum = 20;//dynamic initialization
        //integer range 32 bits -2,147,483,648 .. 2,147,483,647
        boolean b;
        char c;
        Byte by;
        short s;
        long l;
        float f;
        double d;
        
        System.out.println("int = "+inum);
        System.out.printf("integar i = %d \n",inum);
       
        b = true;// boolean true/false
        System.out.println("boolean = "+b);
        System.out.printf("boolean b = %b \n",b);
        
        c = 'a';//colon '' 
        //colon er moddhe dite hobe
        System.out.println("char = "+c);
        System.out.printf("character c = %c \n",c);
        
        by = 127;//8 bits -128 to 127
        System.out.println("Byte = "+by);
        System.out.printf("Byte byte =%d \n ",by);
        
        s = 31000 ;//16 bits short range -32768 to 32767
        System.out.println("short = "+s);
        System.out.printf("short s = %d \n",s);
        
        l= 972036854775806L;//64 bits	-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807
        System.out.println("long = "+l);
        System.out.printf("long l = %d \n",l);
        
        
        f= 20.956566f;
        System.out.println("Float = "+f);
        System.out.printf("Float f = %.2f  \n",f);
        
        d=20.909;
        System.out.println("Double = "+d);
        System.out.printf("Double d = %.3f \n",d);


    }
    
}
