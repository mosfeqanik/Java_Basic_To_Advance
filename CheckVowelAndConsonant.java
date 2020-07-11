
package basic;

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        System.out.print("Enter the Letter: ");
        letter = input.next().charAt(0);
//        if(letter=='a'){
//            System.out.println("Vowel");
//        }else if(letter=='e'){
//            System.out.println("Vowel");
//        }
//        else if(letter=='i'){
//            System.out.println("Vowel");
//        }else if(letter=='o'){
//            System.out.println("Vowel");
//        }else if(letter=='u'){
//            System.out.println("Vowel");
//        }else{
//        System.out.println("Consonant");
//        }
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'){
            System.out.println("Vowel");
        }else{
        System.out.println("Consonant");
        }



    }
}
