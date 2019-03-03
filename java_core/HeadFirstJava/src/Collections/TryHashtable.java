package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;

////isAnagram??
public class TryHashtable {

	static Map<Character,Integer> getFrequencyOfChar(String a){
		if (a==null || a.length() == 0) {
			return null;
		}
		char[] arrA = a.toLowerCase().toCharArray();
		Map<Character,Integer> map1 = new Hashtable<Character,Integer>();
		for (int i=0; i<arrA.length; i++) {
        	if (map1.containsKey(arrA[i])==false) {
        		map1.put(arrA[i], 1);
        		
        	}else {
        		map1.put(arrA[i],map1.get(arrA[i])+1);
        	}
        }
		return map1;
	}
	//dung map dem so luong
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	if(a.length() != b.length()){
	        return false;
	    }
    	Map<Character,Integer> mapA = getFrequencyOfChar(a); 
    	Map<Character,Integer> mapB = getFrequencyOfChar(b); 
    	System.out.println(mapA);
    	System.out.println(mapB);
        return mapA.equals(mapB);
    }
    
    //khong dung map
	static boolean isAnagram1(String a, String b) {
	    // Complete the function
		if(a.length() != b.length()){
	        return false;
	    }
	    char[] arrA = a.toLowerCase().toCharArray();
	    Arrays.sort(arrA);
	    char[] arrB = b.toLowerCase().toCharArray();
	    Arrays.sort(arrB);

//	    return arrA.equals(arrB); //chi so sanh ref
	    return Arrays.equals(arrA, arrB); //so sanh content
	    
	}

	public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        boolean ret1 = isAnagram1(a,b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        System.out.println( (ret1) ? "Anagrams" : "Not Anagrams" );
//        System.out.println("aaa".compareTo("bnsdbfds")>1?"Yes":"No");
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2));
        
//        int[] a1212 = {1,2,3};
//        try {
//        	int a12 = 1/0;
//        }catch(Exception e) {
//        	System.out.println(e);
//        }
//        Map<String, Integer> map1 = new HashMap<String, Integer>();
//        System.out.println(map1.size());
//        
        HashSet<List<String>> set = new HashSet<List<String>>();
        if (set instanceof HashSet) {
        	System.out.println("Yes");
        }
//        List<String> a111 = new ArrayList<String>();
        
	}
	long power(int n, int p) throws Exception{
        if (n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        if (n<0 && p<0){
            throw new Exception("n or p should not be negative.");
        }
        return (long)Math.pow(n,p);
    }
}
