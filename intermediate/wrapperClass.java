package basic.intermediate;

public class wrapperClass {

    public static void main(String[] args) {
        //primitive -> object
        int a = 30;
        Integer Y = Integer.valueOf(a);
        System.out.println("Y= "+Y);
        
        //primitive -> object
        Integer z = a;//Autoboxing
        System.out.println("z = "+z );
        
        boolean b = true;
        Boolean c = Boolean.valueOf(b);
        System.out.println("b = "+c);
        
        Boolean d = c ;
        System.out.println("d = "+d);
        
       
     

    }
}
