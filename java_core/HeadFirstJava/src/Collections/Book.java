package Collections;

import java.util.Comparator;

public class Book implements Comparable<Book> {
	private Integer ID;
	private String name;
	private Integer price;
	
	
	public Book(Integer iD, String name, Integer price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return this.ID.compareTo(arg0.ID);
	}
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}
}

class bookNameComparator implements Comparator<Book>{

	@Override
	public int compare(Book arg0, Book arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}
}
class bookPriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		
		return o1.getPrice().compareTo(o2.getPrice());
	}
	
}