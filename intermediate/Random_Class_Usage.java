package basic.intermediate;

import java.util.Random;

public class Random_Class_Usage {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10)+1;//0 to 9

        System.out.println("Random number = " + randomNumber);

        int anotherRandom = (int)(Math.random()*10)+1;
        System.out.println("Random number = "+anotherRandom);
    }

}
