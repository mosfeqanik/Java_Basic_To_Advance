package basic.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTopic4 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(-3);
        numbers1.add(13);
        numbers1.add(-2);

        System.out.println("before Sorting numbers1 : " + numbers1);

        Collections.sort(numbers1);

        System.out.println("After Sorting numbers1 : " + numbers1);

        //Sorting reverse
        Collections.sort(numbers1,Collections.reverseOrder());
        
        System.out.println("After reverseOrder Sorting numbers1 : " + numbers1);

    }
}
