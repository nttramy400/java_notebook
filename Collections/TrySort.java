package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
	}
}
