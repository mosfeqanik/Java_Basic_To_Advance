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
        System.out.printf("Display a Number %.2f\n", 15.23);
        System.out.println("\n");

        char abbr = 'H';
        String element = "Hydrogen\n";
        System.out.printf("%c stands for %s \n", abbr, element);

        //concatenation
        System.out.println("Full name: " + firstName + " " + SecondName);
        System.out.println(firstName + " 25");

        String firstName1 = "John";
        String lastName2 = "Smith";

        // concatenation using the "+" operator
        String fullName1 = firstName1 + " " + lastName2; // "John Smith"

        // concatenation using the concat method 
        String fullName2 = firstName1.concat(" ").concat(lastName2); // "John Smith"

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

        String[] names = {"Anik", "jumur", "adison", "sakib", "mosfeq", "mahi"};
        System.out.println(Arrays.toString(names));

        for (String x : names) {
            System.out.println(x);
        }

        System.out.println("");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        /*String.format() Method The format() method in the String class works very 
        much like printf() method. 
        The main difference here is that you return 
        a string instead of printing it. Let's see several examples.*/
        int age = 22;
        String str = String.format("My age is %d", age);
        System.out.println(str + "\n");

        char initial = 'M';
        String surname = "Anderson";
        double height = 1.72;

        String details = String.format("My name is %c. %s.%nMy age is %d.%nMy height is %.2f.", initial, surname, age, height);
        System.out.println(details);

    }

}
