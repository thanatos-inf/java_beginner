package other.EXHW3.myExceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BirthdateException {


    public void checkDate(String date) throws ParseException {

        DateFormat date1 = new SimpleDateFormat("dd.MM.yyyy");
        date1.setLenient(false);
        date1.parse(date);

    }
}
