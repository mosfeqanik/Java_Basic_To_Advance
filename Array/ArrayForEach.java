package basic.Array;

public class ArrayForEach {

    public static void main(String[] args) {
        //Decalaration
        String[] name;
        
        name = new String[3];
        name[0] = "Md";
        name[1] = "Mosfeq";
        name[2] = "Anik";

        int lenght = name.length;
        System.out.println(lenght);

        for (int i = 0; i < 3; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println(" ");

        for (String x : name) {
            System.out.print(x + " ");
        }

    }

}
