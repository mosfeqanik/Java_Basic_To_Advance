package basic.StringDemo;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder S1 = new StringBuilder("Mosfeq");
        System.out.println(S1);

        S1.append(" anik ");
        S1.append("01676667735");

        System.out.println(S1);

        S1.delete(0, 3);
        System.out.println(S1);

        S1.reverse();
        System.out.println(S1);

    }

}
