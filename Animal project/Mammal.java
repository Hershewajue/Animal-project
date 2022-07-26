
public class Mammal extends Animal {
	// constructor
	public Mammal(String name){
		super(name);
	}

	@Override // toString method
	public String toString() {
		return "Mammal [toString()=" + super.toString() + "]";
	}

}
