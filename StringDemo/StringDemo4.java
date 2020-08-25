package basic.StringDemo;

import java.util.Arrays;

public class StringDemo4 {

    public static void main(String[] args) {
        String s1 = "this is my country";
        System.out.println("String S1 is :" + s1);
        
        String s2 = s1.replace('i', 'j');
        System.out.println("String S2 is :" + s2);
        
        String[] s3=s1.split(" ");
        System.out.println(Arrays.toString(s3));
        
        for(String x:s3){
            System.out.println(x);
        }   

    }

}
