package page112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				return null;
		}catch(IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
	public static void main(String[] args) {
		GameHelper tmp = new GameHelper();
		String a = tmp.getUserInput("a: ");
		System.out.println(a);
		System.out.println("end");
		
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
		}
		
		//////////////
		String num = "2";
		int x= 2;
		Integer y =2;
		long z = 2;
		double t = 2.0;
		float u = 2.0f;
		if(x == y || y==z) {
			System.out.println("true");
		}
		if(x == t) {
			System.out.println("true1");
		}
		if(u == t) {
			System.out.println("true2");
		}
		
		///////////
		String[] myList = new String[2];
		String[] myList1 = {"ab","bc"};
		
		///thử ArrayList //do truyen tham so obj nen ArrayList<Integer> cac method truyen arg kieu co the khac integer 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		System.out.println("size "+ arr.size());
		boolean isIn = arr.contains("s");
		isIn = arr.contains(2);
		System.out.println("contains "+ arr.contains(2)); //boolean
		int index = arr.indexOf(2);
		System.out.println("index of an element in arr "+ index); //position
		index = arr.indexOf(3);
		System.out.println("index of an element not in arr "+ index); //-1
		index = arr.indexOf("a");
		System.out.println("index of an element not in arr "+ index); //-1
		System.out.println("lala "+ arr.get(0)); //ArrayList khong dung duoc arr[0] ma fai dung arr.get(0)
		
		
		ArrayList<Integer> uuuu = new ArrayList<Integer>(5); //5 la capacity muon khoi tao, ko co tac dung tao array 5 phan tu
		System.out.println(uuuu);
		ArrayList<Integer> yyyy = new ArrayList<>(uuuu);
		System.out.println(uuuu.isEmpty());
		System.out.println(uuuu.size());
	
	}
}
