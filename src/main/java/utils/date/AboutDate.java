package utils.date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class AboutDate {
	
	  // format form "dd.MM.yyyy HH:mm:ss" to "dd.MM.yyyy"
	  private String formatDate(String originFormat, String format) throws ParseException
	  {
		  DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
			DateFormat formatter1 = new SimpleDateFormat(format);
			return formatter1.format(formatter.parse(originFormat));
	  }
	  
	  private String formatToXMLGregorianCalendar(String strDate) throws ParseException, DatatypeConfigurationException
	  {
		    GregorianCalendar cal = new GregorianCalendar();
		    cal.setTime(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH).parse(strDate));
		    XMLGregorianCalendar xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
//			return xmlCalender.toString().substring(0, 10);
		    return xmlCalender.toString().substring(11);
			
	  }

	public static void main(String[] args) throws ParseException, DatatypeConfigurationException {
		String sampleDate = "22.09.2020 06:54:38";	
		AboutDate abouDate = new AboutDate();
		System.out.println(abouDate.formatDate(sampleDate, "dd.MM.yyyy"));
		System.out.println(abouDate.formatToXMLGregorianCalendar(sampleDate));

	}

}
