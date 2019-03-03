package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TrySortBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1, "Path 1", 12000);
		Book book2 = new Book(2, "Path 2",10000);
		Book book3 = new Book(3, "Path 3",20000);
		if (book2.compareTo(book3)<0) {
			System.out.println(true);
		}
		ArrayList<Book> arr = new ArrayList<Book>(Arrays.asList(book1,book2,book3));
		
		Collections.sort(arr, new bookPriceComparator());
		System.out.println(arr);
//		Collections.sort(arr, (book1, book2)->1);
		Collections.sort(arr, (Book o11, Book o12) -> o11.getPrice().compareTo(o12.getPrice())  );
		Collections.sort(arr, (o1, o2)->1);
		arr.forEach(s->System.out.println(s));
		Thread a = new Thread(()->System.out.println(1));
		Collections.sort(arr,new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return 1;
			}

		});
		Iterator<Book> it = arr.iterator();
		while (it.hasNext()) {
			Book item = it.next();
			System.out.println("*" + item);
		}
		for (Book book:arr) {
			
		}
		HashSet<Book> set = new HashSet<Book>();
		set.iterator();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(0, "a");
//		ArrayList<String> a12 = (ArrayList<String>)map.values(); //sai phải new ArrayList r truyền vào arg, k đc cast
		HashSet<Integer> set1 = new HashSet<Integer>(map.keySet());
//		map.containsKey(1);
		System.out.println(set1);
		for (Map.Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry);
			
		}
		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
		
		list.sort(Map.Entry.comparingByValue());
//		Map<K, V> result = new LinkedHashMap<>();
//        for (Entry<K, V> entry : list) {
//            result.put(entry.getKey(), entry.getValue());
//        }
		Thread a11 = new Thread(new Runnable() {
			public void run() {
				
			}
		});
		StringBuilder s = new StringBuilder("abc");
		s.delete(1, 2);
		System.out.println(s);
		s.insert(1,"1asf");
		System.out.println(s);
		ArrayList<Integer> arr1 =new ArrayList<Integer>();		
		
	}

}
