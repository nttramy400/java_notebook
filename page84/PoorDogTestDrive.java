package page84;

import java.util.Calendar;

public class PoorDogTestDrive {
	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("size " + one.getSize());
		System.out.println("name " + one.getName());
		System.out.println("firstLetter " + (int)one.getFirstLetter());
		long size = 2;
		//one.setSize(size);// lỗi, phải ép kiểu xuống int
	
		String s = String.format("%,f", 1000.3f);
		System.out.println(s);
	}
}
