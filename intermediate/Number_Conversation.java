package basic.intermediate;

public class Number_Conversation {
    public static void main(String[] args) {
        
        int number = 12;
        String ecima = Integer.toBinaryString(number); 
        System.out.println("Decimal = " + ecima);
        
        String Octal = Integer.toOctalString(number);
        System.out.println("Octal = " + Octal);
        
        String hex = Integer.toHexString(number);
        System.out.println("hexadecimal = " + hex);
    }
}
