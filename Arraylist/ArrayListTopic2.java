
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

        
        

    }
}
