package basic.BasicSyntax;

public class TernaryOperator {

    public static void main(String[] args) {
        int a = 23;
        int b = 25;
        int max = 24;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        //TernaryOperator
        max = a > b ? a : b;
        //result = condition ? trueCase : elseCase;
        int num = 21;  // it's initialized by a value
        System.out.println(num % 2 == 0 ? "even" : "odd");

    }
}
