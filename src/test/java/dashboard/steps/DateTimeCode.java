package dashboard.steps;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeCode {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd'at'hh:mm:ss a zzz");
		System.out.println("Current Date:" + ft.format(date));
		String str=String.format("Current Date/Time: %tc");
		System.out.printf(str);
		System.out.println("");
		System.out.printf("%1$s %2$tB %2$td, %2$ty", "==========", date);
		

	}

}
