package basic.intermediate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");

        String SimpleDate = dateformat.format(date);
        System.out.println("Current Date"+SimpleDate);
    }
}
