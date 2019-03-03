package Collections;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindMinMaxSubstring {

   
   
    public static String getSmallestAndLargest(String s, int k) {
        
        
        ArrayList<String> substringList = new ArrayList<String>();
        int strLength = s.length();
        for (int i=0; i<strLength-k+1; i++){
            substringList.add(s.substring(i,i+k));
        }
        Collections.sort(substringList);
        
        String smallest = substringList.get(0);
        String largest = substringList.get(substringList.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
//        String[] aaa = {"a","v"};
//        aaa[0] = "a123";
//        System.out.println(Arrays.toString(aaa));
//        ArrayList<String> aaaa = new ArrayList<String>(Arrays.asList(aaa));
//        StringBuilder a = new StringBuilder("bcbss");
//        a.reverse();
//        System.out.println(a);
        System.out.println(getSmallestAndLargest(s, k));
    }
}