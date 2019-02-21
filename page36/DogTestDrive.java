package page36;

public class DogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.size = 40;
		d.bark();
		
		//////page60
		Dog[] pets;
		pets = new Dog[7];
		System.out.println(pets[0]); //null
		pets[0] = new Dog();
		System.out.println(pets[0]); //page36.Dog@15db9742
		pets[1] = pets[0];
		System.out.println(pets.length);
	}

}
