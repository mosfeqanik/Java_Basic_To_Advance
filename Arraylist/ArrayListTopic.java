package basic.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTopic {

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

        numbers.add(3, 120);
        System.out.println("Size : " + numbers.size());
        System.out.print(numbers + " ");

        System.out.println("");
        System.out.println("Size : " + numbers.size());
        System.out.println("for each:");
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("Size : " + numbers.size());
        System.out.println("Use Iterator:");
        Iterator itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        System.out.println(" ");
        //for loop
        System.out.println("for loop");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println("");
        numbers.remove(3);
        System.out.println("after removing:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("");
        System.out.println("after removeall");

        numbers.removeAll(numbers);
        System.out.println(" " + numbers);

    }
}
