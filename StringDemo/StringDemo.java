package basic.StringDemo;

import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {
        String S1 = "Mosfeq Anik";
        System.out.println("S1 :" + S1);

        String S2 = new String("Mahi anan ");
        System.out.println("S2 :" + S2);

        char[] name = {'a', 'n', 'i', 'k'};
        System.out.println("name :" + Arrays.toString(name));

        S2 = new String("Mosfeq Anik");
        System.out.println("S2 sets as S1 :" + S2);

        int len = S1.length();
        System.out.println("length of S1 String : " + len);

        //== ADDRESS DEKHE
        //equals is for value 
        if (S1.equals(S2)) {
            System.out.println("S1 is equal to S2 ,true");
        } else {
            System.out.println("S1 is not equal to S2 ,false");

        }
        if (S1.contains(S2)) {
            System.out.println("S1 is contains S2 ,true");
        } else {
            System.out.println("S1 is contains S2 ,false");

        }
        
        if (S1.equalsIgnoreCase(S2)) {
            System.out.println("without uppercase and lowercase S1 equal to S2 ,true");
        } else {
            System.out.println("without uppercase and lowercase S1 equal to S2 ,false");

        }
        
        boolean cos = S1.contains("Anik");
        System.out.println(cos);
        
        S1="";
        boolean pos = S1.isEmpty();
        System.out.println(pos+" S1 is empty "+S1);
        
    }

}
