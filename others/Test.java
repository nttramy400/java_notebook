package others;

public class Test {
	public static void main(String[] args) {
		Animal a;
		Cat b = new Cat();
		a = new Cat();
		a.bark();
		//a.catchMouse();
		b.catchMouse();
		
		System.out.println("----------");
		a.eat();
		System.out.println("--------------");
		System.out.println(a.getClass());
	}
}
