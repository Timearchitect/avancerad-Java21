import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; // bad

public class DateAndFormatter {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date date = new Date();
		System.out.println(date.getMonth()+1);
		
		System.out.println( format.format(date));
		
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DAY_OF_MONTH, 7);
//		cal.add(Calendar.MONTH, -2);
		cal.add(Calendar.WEEK_OF_MONTH, 1);
		System.out.println(cal.getTime());
		System.out.println(format.format(cal.getTime()));
		
	}
}
