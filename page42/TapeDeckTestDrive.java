package page42;

public class TapeDeckTestDrive {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck();
		t.canRecord = true; //canRecord dang o default co the truy cap trong package
		t.playTape();
		if (t.canRecord == true) {
			t.recordTape();
		}
		
		/////////////////////////////////////////////////
		
		float f = 3.15f; // phao co f vi mac dinh 3.15 la double
		long l = 10+(long)f;
		int x=(int)34.6;
		System.out.println(x);//34
		/////
		int a = 2;
		int b= a;
		a = 100;
		System.out.println(b);
		
		Integer c = 2;
		Integer d = c;
		c = 100;
		System.out.println(d);
		
		/////
		final TapeDeck tap = new TapeDeck();
		TapeDeck tap1 = new TapeDeck();
		//tap = tap1; // final nên không gán đc
		final TapeDeck tap2 =  null;
		//tap2 = new TapeDeck();// final nên không gán đc cho dù gtri ban dau la null
		
		//////
		int[] arr = new int[7];
		System.out.println(arr[1]);
		System.out.println(arr[6]);
		//System.out.println(arr[7]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
	}
}
