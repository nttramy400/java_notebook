package others;

public class Cat extends Animal{

	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("meow meow");
	}
	public void catchMouse() {
		System.out.println("catch mouse");
	}
	@Override
	public void eat() {
		System.out.println("lalala");
		super.eat();
	}
}
