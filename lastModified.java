import java.util.Calendar;
public class lastModified {
    public static String getDate() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();
        return dateTimeStr;
    }
}
