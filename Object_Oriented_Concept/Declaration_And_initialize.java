package basic.Object_Oriented_Concept;

public class Declaration_And_initialize {

    public static void main(String[] args) {
        Student Anik = new Student();//Declaration with initialize

        Anik.roll = "1232";
        Anik.Class_name = "upper Class";
        Anik.name = "Anik";
        Anik.phone = 1778881448;
        Anik.Address = "Mirpur";
        Anik.age = 25;

        System.out.println("Anik's roll is " + Anik.roll);
        System.out.println("Anik's Class_name is " + Anik.Class_name);
        System.out.println("Anik's name is " + Anik.name);
        System.out.println("Anik's phone is " + Anik.phone);
        System.out.println("Anik's Address is " + Anik.Address);
        System.out.println("Anik's age is " + Anik.age);

    }
}
