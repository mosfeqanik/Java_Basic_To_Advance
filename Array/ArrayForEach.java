package basic.Array;

public class ArrayForEach {

    public static void main(String[] args) {
        //Decalaration
        String[] name;
        //initializing
        String classmateName[] = {"forhad", "Sakib", "nirjon", "proshanto", "Prodip"};
        int roll[] = {10, 120, 32, 32, 3, 4, 523, 5, 342, 523};
        int Marks[] = {130, 12, 322, 43, 54, 34, 15, 42, 23};
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
        System.out.println("");
        System.out.println(classmateName.length);

        for (String x : classmateName) {
            System.out.print(x + " ");
        }
        for (int x : roll) {
            System.out.println(x);
        }

        int sum = 0;
        for (int x : roll) {
            sum = sum + x;
        }
        System.out.println("sum of total Marks: "+sum);

    }

}
