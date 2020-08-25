package basic.StringDemo;

public class StringPanlindomeCheck {

    public static void main(String[] args) {
        String s1 = "madam";
        System.out.println(s1);

        StringBuffer Sb = new StringBuffer(s1);

        String String_afterreverse = Sb.reverse().toString();
        System.out.println(Sb);

        if (s1.equals(String_afterreverse)) {
            System.out.println("its palindome");
        } else {
            System.out.println("its not palindome");
        }

    }
}
