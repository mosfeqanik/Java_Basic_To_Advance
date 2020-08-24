package basic.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTopic2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Size : " + numbers.size());
        //adding elements to ArrayList
        numbers.add(12);
        numbers.add(3);
        numbers.add(4);
        numbers.add(32);
        numbers.add(333);
        System.out.println("Size : " + numbers.size());
        System.out.println(numbers + " ");

        numbers.removeAll(numbers);
        System.out.println("after remove all method" + numbers);

        numbers.add(12);
        numbers.add(3);
        numbers.add(4);
        numbers.add(32);
        numbers.add(333);
        System.out.println("Size : " + numbers.size());
        System.out.println(numbers + " ");

        numbers.clear();
        System.out.println("after clear method" + numbers);

        boolean check = numbers.isEmpty();
        System.out.println("boolean result of clear : " + check);

        numbers.add(12);
        numbers.add(3);
        numbers.add(4);
        numbers.add(32);
        numbers.add(333);

        System.out.println("Size : " + numbers.size());
        System.out.println(numbers + " ");

        check = numbers.isEmpty();
        System.out.println("boolean result of clear : " + check);

        //find out the number of array 
        boolean pos = numbers.contains(32);
        System.out.println("is 32 is in the arrayList : " + pos);

        //get the index
        int position = numbers.indexOf(32);
        System.out.println("index of 32 in the arrayList : " + position);

        //replace a number
        numbers.set(3, 50);
        System.out.println("After replacing arrayList : " + numbers);

        //get the value from index
        int postionIndex = numbers.get(4);
        System.out.println("value of index of 4 : " + postionIndex);

    }
}
