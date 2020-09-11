package basic.Object_Oriented_Concept;

public class MethodUsing {
    public static void main(String[] args) {
        Student Anik = new Student();//Declaration with initialize

        Anik.roll = "1232";
        Anik.Class_name = "upper Class";
        Anik.name = "Anik";
        Anik.phone = 1778881448;
        Anik.Address = "Mirpur";
        Anik.age = 25;
        
        Anik.displayInfortamtion();
        
        Student Anan = new Student();//Declaration with initialize

        Anan.roll = "1";
        Anan.Class_name = "Supreme Class";
        Anan.name = "Anan";
        Anan.phone = 181823108;
        Anan.Address = "Mirpur";
        Anan.age = 10;
        
        Anan.displayInfortamtion();
    }
}
