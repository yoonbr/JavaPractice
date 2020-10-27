package java1027;

import java.util.Calendar;

public class DateTime2 {

	public static void main(String[] args) {
		
		// GregorianCalendar 
		Calendar cal = Calendar.getInstance();
		System.out.printf("%s\n", cal);
		
		java.util.Date uDate = new java.util.Date();
		System.out.printf("%s\n", uDate); 

	}
}
