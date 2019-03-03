package Collections;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class TrySort {
	public static void main(String[] args) {
		///////////////sort String
		String[] arrStr = {"abc","bts","aaaa"};
		ArrayList<String> name = new ArrayList<String>(Arrays.asList(arrStr));
		ArrayList<String> name1 = new ArrayList<String>(Arrays.asList("abc1","bts1","aaaa1"));
		//k the cast lkieu nay
		//ArrayList<String>name1  = (ArrayList<String>)Arrays.asList("abc1","bcd1","aaaa1");
		//java.util.Arrays$ArrayList cannot be cast to java.util.ArrayList
		
		Collections.sort(name);
		System.out.println("name" + name);
		Collections.sort(name1);
		System.out.println("name1" + name1);
		
		//sort int
		ArrayList<Integer> arrNum = new ArrayList<Integer>();
		arrNum.add(1);
		arrNum.add(2);
		arrNum.addAll(Arrays.asList(1,2,3));
		System.out.println("arrNum"+ arrNum);
		Collections.sort(arrNum);
		System.out.println("arrNum" + arrNum);
		
		
		//////sort descending
		//List
		Collections.sort(arrNum, Collections.reverseOrder());
		System.out.println("reverse order arrNum" + arrNum);
		
		//Array]'
		int a[]= {1,2,3,0,9};
		Arrays.sort(a);
		System.out.println("a:" + Arrays.toString(a)); //
		
		//sort bool
		ArrayList<Boolean> arrBool = new ArrayList<Boolean>();
		arrBool.add(true);
		arrBool.add(false);
		arrBool.addAll(Arrays.asList(true, false));
		Collections.sort(arrBool);
		System.out.println("arrBool:"+arrBool);
		
		if("abc".compareTo("aaa") > 0) {
			System.out.println("greater");
		}
		
		
//		String a12 = "abcc///fds";
//		String[] arrStr12 = a12.split("/");
//		System.out.println(arrStr12[1]);
//		if(arrStr12[1].isEmpty()) {
//			System.out.println("aaaa");
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		String s1 = scanner.nextLine();
//		String s2 = scanner.next();
//		Integer i = scanner.nextInt();
//		System.out.println(s1);
//		
//		System.out.println(s2);
//		System.out.println(i);
//		scanner.close();
//		Integer num = 0;
//		System.out.println(num + "aa");
		String s1 = "abc ";
		int x = 1222;
		System.out.printf("%-15s%03d%n", s1, x);
		System.out.printf("%15s%03d%n", s1, x);
		System.out.print("123");
		System.out.println("1231");
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 0, 6);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		LocalDate dt = LocalDate.of(2015, 8, 5);
		System.out.print(dt.getDayOfWeek());
//		ArrayList<String> str123 = new ArrayList<String>();
		String a123 = "abc";//
		Integer a145[] = {2,3,4};
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(a145));
		
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
		arr.forEach((Integer t)->{
				System.out.print(t+" ");
				System.out.println(" A ");
			});
		arr.forEach(t->System.out.println(t));
		
		
		
	}
}
