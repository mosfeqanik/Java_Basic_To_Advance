package basic.Object_Oriented_Concept;

public class Declaration_And_initialize_With__constructor {

    public static void main(String[] args) {
        Student1 Anik = new Student1("Anik","upper Class","Mirpur","rl",25,1778881448);//Declaration with initialize
        Anik.displayInfortamtion();

        Student1 anan = new Student1("Anan","Supreme Class","Mirpur","r2",10,1818231208);//Declaration with initialize
        anan.displayInfortamtion();
        
        Student1 mahi = new Student1();//Declaration with initialize
        mahi.displayInfortamtion();
        
    }
}
