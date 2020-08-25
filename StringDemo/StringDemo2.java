package basic.StringDemo;

import java.util.Arrays;

public class StringDemo2 {

    public static void main(String[] args) {
        String firstName = "Mosfeq";
        String SecondName = " Anik";

        
        //format-specifiers
        System.out.printf("Display a Number %d", 15000);
        
        //several integers to display in the output
        System.out.printf("Sum of %d and %d is %d\n", 15, 40, 55);
        System.out.printf("My Name is %s. I was born in %d \n", "Mike", 1998);
        
        System.out.printf("Display a Number %f \n", 15.23);
        
        System.out.println("\n");
        //concatenation
        System.out.println("Full name: " + firstName + " " + SecondName);
        System.out.println(firstName + " 25");

        String Fullname = firstName.concat(SecondName);
        System.out.println(Fullname);

        String FullName_upperCase = Fullname.toUpperCase();
        System.out.println(FullName_upperCase);

        String FullName_LowerCase = Fullname.toLowerCase();
        System.out.println(FullName_LowerCase);

        boolean b = Fullname.startsWith("M");
        System.out.println("DOES " + Fullname + " starts With M :" + b);

        boolean a = Fullname.startsWith("a");
        System.out.println("DOES " + Fullname + " starts With a :" + a);

        boolean e = Fullname.endsWith("Anik");
        System.out.println("DOES " + Fullname + " ends With Anik :" + e);
        
        boolean d = Fullname.endsWith("anik");
        System.out.println("DOES " + Fullname + " ends With anik :" + d);
        
        boolean c = Fullname.endsWith("feq");
        System.out.println("DOES " + Fullname + " ends With feq :" + c);
        
        String[] names = {"Anik","jumur","adison","sakib","mosfeq","mahi"};
        System.out.println(Arrays.toString(names));
        
        
        for (String x:names) {
            System.out.println(x);
        }
        
        System.out.println("");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
    
    }

}
