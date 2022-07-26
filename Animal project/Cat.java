
public class Cat extends Mammal {
	// constructor
	public Cat(String name) {
		super(name);
	}

	// getter method
	public void getGreets() {
		System.out.println("Meow");
	}

	@Override // toString method
	public String toString() {
		return "Cat [toString()=" + super.toString() + "]";
	}

}
