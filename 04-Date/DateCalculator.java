import java.util.Calendar;
public class DateCalculator {
    public static void main(String[] args) {
        Calendar date1 = Calendar.getInstance();
        date1.set(1992, 4, 18);
        Calendar date2 = Calendar.getInstance();
        date2.set(2023, 3, 15);
        long diff = date2.getTimeInMillis() - date1.getTimeInMillis();
        long daysBetween = diff / (24 * 60 * 60 * 1000);
        System.out.println("Days between " + date1.getTime() + " and " + date2.getTime() + ": " + daysBetween);
    }
}
