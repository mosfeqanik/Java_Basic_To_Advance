package basic.Object_Oriented_Concept;

public class Declaration_And_initialize_With_OverLoading_method_constructor {

    public static void main(String[] args) {
        Overloading_Constructor_Student mahi = new Overloading_Constructor_Student();//Declaration with initialize
        mahi.displayInfortamtion();

        Overloading_Constructor_Student anan = new Overloading_Constructor_Student("Anan","Supreme Class","Mirpur","r2");//Declaration with initialize
        anan.displayInfortamtion();
        
        Overloading_Constructor_Student Anik = new Overloading_Constructor_Student("Anik","upper Class","Mirpur","rl",25,1778881448);//Declaration with initialize
        Anik.displayInfortamtion();
        
    }
}
