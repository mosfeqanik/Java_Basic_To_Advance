
package basic.intermediate;

public class wrapperclassUnboxing {
    public static void main(String[] args) {
        //object-> primitive
        Double dou = new Double(56.9);
        System.out.println("double "+ dou);
        
        double e = dou.doubleValue();
        System.out.println("double "+e);
        
        double f = dou;
        System.out.println("double "+e);
        
        
         
    }
    
}
