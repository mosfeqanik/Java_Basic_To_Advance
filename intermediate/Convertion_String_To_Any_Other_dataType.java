
package basic.intermediate;

public class Convertion_String_To_Any_Other_dataType {
    public static void main(String[] args) {
        String i = "100";
        int j = Integer.parseInt(i);
        System.out.println("j = "+j );
    
        int e = Integer.valueOf(i);
        System.out.println("e = "+e );
        
        String d = "30.55";
        double r = Double.parseDouble(d);
        System.out.println("r = "+r );
        
        double t = Double.valueOf(d);
        System.out.println("t = "+t );
    }
}
