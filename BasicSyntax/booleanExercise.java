package basic.BasicSyntax;

public class booleanExercise {

    public static void main(String[] args) {
        boolean f = false; // f is false
        boolean t = !f;    // t is true

        boolean b1 = false && false; // false
        boolean b2 = false && true;  // false
        boolean b3 = true && false;  // false
        boolean b4 = true && true;   // true

        boolean b5 = false || false; // false
        boolean b6 = false || true;  // true
        boolean b7 = true || false;  // true
        boolean b8 = true || true;   // true

        boolean b9 = false ^ false; // false
        boolean b10 = false ^ true;  // true
        boolean b11 = true ^ false;  // true
        boolean b12 = true ^ true;   // false

        /*The precedence of logical operators
        Below are the logical operations sorted in order of decreasing 
        their priorities in expressions: ! (NOT), ^ (XOR), && (AND), || (OR).
        So, the following variable is true:*/
        boolean b = true && !false; // true, because !false is evaluated first

        /*n example: trekking
        As an example, let's write a complex boolean expression 
        that determines the possibility of trekking in summer and in other seasons.*/
        boolean cold = false;
        boolean dry = true;
        boolean summer = false; // suppose now is autumn

        boolean trekking = dry && (!cold || summer); // true, let's go to trek!

        boolean e1=false;
        boolean e2=false;
        e1=!e1 || e1;
        System.out.println("!b1 || b2 "+e1);
        e1=e1 || !!e2;
        System.out.println("b1 || !!b2 "+e1);
        e1=!e1 && e2;
        System.out.println("!b1 && b2 "+e1);
        e1=!(e1 || e2);
        System.out.println("!(b1 || b2) "+e1);
e1=!e1 && !e2;
        System.out.println("!b1 && !b2 "+e1);        
    }

}
