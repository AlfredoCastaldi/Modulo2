import java.text.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
     Triangolo forma1 = new Triangolo(10,5);
     Rettangolo forma2 = new Rettangolo(10,5);


     System.out.println(forma1.tipo);
     System.out.println(forma2.tipo);

     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
     Date today = c.getTime();
     System.out.println(today);
     String pattern = "dd-mm-yyyy";
     SimpleDateFormat sDf = new SimpleDateFormat(pattern);
     Date mydate = sDf.parse(pattern);
     System.out.println(sDf.format(mydate));

    }


}
