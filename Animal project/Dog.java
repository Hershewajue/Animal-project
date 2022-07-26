
public class Dog extends Mammal {
	// constructor
	public Dog(String name) {
		super(name);
	}

	// getter method
	public void getGreets() {
		System.out.println("Woof");
	}

	public void getGreets(Dog anotherDog) {
		System.out.println("Woooof");
	}

	@Override // toString method
	public String toString() {
		return "Dog [toString()=" + super.toString() + "]";
	}

}
