package basic.intermediate;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class TimeExample {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        DateTimeFormatter Dateformated = DateTimeFormatter.ofPattern("hh:mm:ss");

        String FormattedTime = time.format(Dateformated);
        System.out.println(FormattedTime);

    }

}
