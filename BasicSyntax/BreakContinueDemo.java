package basic.BasicSyntax;

public class BreakContinueDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i==10) {
                break;
                //Break er time for loop ar kaj korbe na 
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------");
        
        for (int i = 1; i <= 100; i++) {
            if (i==10) {
                continue;
                //Continue er time for loop e oi time badh porbe  
            }
            System.out.println(i);
        }
    }
    
}
