package page305;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(2004,0,7,15,40);
		long day1 = c.getTimeInMillis();
		System.out.println(day1);
		day1 += 1000*60*60;
		
		
		c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));//tra ve current hour tren thang 12
		System.out.println("new hour " + c.get(c.HOUR)); //tuong tu nhung tren thang 12
		c.add(c.DATE, 35);
		System.out.println("add 35 days: " + c.getTime());
		c.roll(c.DATE, 35);
		System.out.println("roll 35 days " + c.getTime());
		
		c.set(c.DATE,1);// set date = 1
		System.out.println(c.getTime());
		
		/////
		System.out.println(c.getTime());
		System.out.println(c.get(c.DATE));
		System.out.println(c.DATE);
		System.out.println(Calendar.DATE);
		
//		Integer a = Integer.parseInt("1");
//		System.out.println(a);
	}

}
