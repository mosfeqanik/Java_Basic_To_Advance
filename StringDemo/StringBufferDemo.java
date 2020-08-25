package basic.StringDemo;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer S1 = new StringBuffer("Mosfeq Anik");
        System.out.println(S1);

        S1.append(" HI,");
        S1.append(" How are you?");

        System.out.println(S1);

        S1.reverse();
        System.out.println(S1);

        StringBuffer S2 = new StringBuffer("MD Mosfeq Anik");

        System.out.println(S2);

        S2.delete(0, 4);

        System.out.println(S2);

        S2 = new StringBuffer("MD Mosfeq Anik");
        S2.setLength(5);

        System.out.println(S2);

    }
}
