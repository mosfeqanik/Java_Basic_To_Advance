package basic.Arraylist;

import java.util.ArrayList;

public class ArrayListTopic3 {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers1 = new ArrayList<Integer>();
        ArrayList<Integer> Numbers2 = new ArrayList<Integer>();
        ArrayList<Integer> Numbers3 = new ArrayList<Integer>();

        Numbers1.add(10);
        Numbers1.add(20);
        Numbers1.add(30);
        Numbers1.add(40);

        System.out.println("Number1 : " + Numbers1);

        Numbers2.add(1);
        Numbers2.add(2);
        Numbers2.add(3);
        Numbers2.add(4);

        System.out.println("Number2 : " + Numbers2);

        Numbers3.addAll(Numbers1);

        System.out.println("Number3 : " + Numbers3);

        boolean result = Numbers1.equals(Numbers2);
        System.out.println("Numbers1==Numbers2 "+result);
        result = Numbers1.equals(Numbers3);
        System.out.println("Numbers1==Numbers3 "+result);

    }

}
