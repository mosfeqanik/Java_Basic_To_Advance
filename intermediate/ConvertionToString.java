
package basic.intermediate;

public class ConvertionToString {
    public static void main(String[] args) {
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("s ="+s);
        
        double d = 100.33;
        String f = Double.toString(d);
        System.out.println("f ="+f);
        
        boolean b = true;
        String g = Boolean.toString(b);
        System.out.println("g ="+g);
        
    }
}
