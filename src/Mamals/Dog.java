package Mamals;

public class Dog extends Mamal implements MT {

	@Override
	public void swim() {
		System.out.println("Hey i can swim" + " warm blooded = " + super.warmBlooded);

	}

	@Override
	public void walk() {
		System.out.println("Hey i can walk" + " warm blooded = " + super.warmBlooded);
	}

	@Override
	public void fly() {
		System.out.println("Hey i cant fly!! youre making me" + " warm blooded = " + super.warmBlooded);		
	}

}
