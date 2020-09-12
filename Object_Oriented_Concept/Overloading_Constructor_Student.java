
package basic.Object_Oriented_Concept;

public class Overloading_Constructor_Student {
    String name, Class_name, Address, roll;
    int age, phone;
    
    Overloading_Constructor_Student(){
        System.out.println("No Value");
    }
    
    Overloading_Constructor_Student(String n, String C_name, String address, String rl) {
        name = n;
        Class_name = C_name;
        Address = address;
        roll = rl;
    }
    
    Overloading_Constructor_Student(String n, String C_name, String address, String rl, int ag, int pn) {
        name = n;
        Class_name = C_name;
        Address = address;
        roll = rl;
        age = ag;
        phone = pn;

    }

    void displayInfortamtion() {
        System.out.println("Student's roll is " + roll);
        System.out.println("Student's Class_name is " + Class_name);
        System.out.println("Student's name is " + name);
        System.out.println("Student's phone is " + phone);
        System.out.println("Student's Address is " + Address);
        System.out.println("Student's age is " + age);

        System.out.println("\n  ");
    }
    
}
