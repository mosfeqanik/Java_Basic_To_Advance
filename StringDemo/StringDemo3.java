package basic.StringDemo;

public class StringDemo3 {

    public static void main(String[] args) {
        String country = "Bangladesh is beautiful country";
        System.out.println(country);

        char ch = country.charAt(5);
        System.out.println("index(5) is " + ch);

        //for printing ascii value
        int value = country.codePointAt(5);
        System.out.println("for ascii value" + value);

        int pos = country.indexOf('n');
        System.out.println("n's index is " + pos);

        int last = country.lastIndexOf('n');
        System.out.println("n's index is for last to first " + last);
        
        
        String computer_Name = " Dell Vostro ";
        String s3= computer_Name.trim();
        System.out.println(s3);
        
    
    
    }

}
