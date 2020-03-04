package spielwiese;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static String
			getCurrentDateTimeMS() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyMMdd");
		String datetime = ft.format(dNow);
		return datetime;
	}

	private static String
			formatDateToString() throws ParseException {
		String date_s = " 2011-01-18 00:00:00.0";
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
		Date date = dt.parse(date_s);
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
		return dt1.format(date);
	}

	public static void
			main(String args[]) throws InterruptedException,
					ParseException {

		String orderid = DateTime.getCurrentDateTimeMS();
		String formatedDate = DateTime.formatDateToString();
		System.out.println(orderid);
		System.out.println(formatedDate);
	}
}