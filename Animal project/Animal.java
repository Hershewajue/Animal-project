
public class Animal {
	private String name;

	// constructor
	public Animal(String name) {
		this.name = name;
	}

	// getter method
	public String getName() {
		return name;
	}

	@Override // toString method
	public String toString() {
		return "Animal [getName()=" + getName() + "]";
	}
}
