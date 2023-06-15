package slayt9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class DateDemo {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());
		
		DateFormat frmt=new SimpleDateFormat("dd/MM/yyyy HH:mm ");//a koyarsan am pm yapar
		System.out.println(frmt.format(date));
		
		Date date2=null;
		try {
			date2 =frmt.parse("04/06/1992 05:22 ");//yukarýdaki ile boþluk dahil ayný olmaý gerek
		} catch (Exception e) {
			System.out.println("çevirme iþlemi baþarýsýz"+e);
		}
		System.out.println(date2);
		
		Calendar c= new GregorianCalendar();
		c.set(Calendar.HOUR_OF_DAY,3);
		c.set(Calendar.MINUTE,20);
		c.set(Calendar.SECOND,30);
		Date d1=c.getTime();
		System.out.println(d1);
	System.out.println("--------------------------------------------");	
		Date date3 =new Date();
		//String str=String.format(null, args);
		String str=String.format("Þimdiki zaman : %tc", date3);
		System.out.println(str);
		
		Date date4 =new Date();
		System.out.printf("%1$s %2$tB %2$tm","Ay: ",date4);//1.virgül 2.virgül
		System.out.println();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
		Date date_1=null;
		Date date_2=null;
		
		try {
			date_1=sdf.parse("2014/05/12");
			date_2=sdf.parse("2016/05/12");
			int	durum=date_1.compareTo(date_2);//int gösteriyor bu sebepten
		System.out.println("Sayýsal deðer = "+durum);
		boolean durum2=date_1.after(date_2);//sonra mý
		//before equals for exp....
		System.out.println(durum2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
