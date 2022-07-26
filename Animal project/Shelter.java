import java.util.*;

public class Shelter {
	ArrayList<Animal> animalsList; // creates an arrayList for Animal class

	// constructor for Shelter
	public Shelter() {
		animalsList = new ArrayList<Animal>();
	}

	// setter and getter methods
	public ArrayList<Animal> getAnimals() {
		return animalsList;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animalsList = animals;
	}

	// method to add an animal
	public void addAnimal(Animal newAnimal) {
		if (!animalsList.contains(newAnimal)) {
			animalsList.add(newAnimal);
			System.out.println("New animal was added to the Shelter!");
		} else
			System.out.println("The animal " + newAnimal.getName() + "  is already in the shelter!");
	}

	// method to remove an animal
	public void removeAnimal(Animal animal) {
		if (animalsList.contains(animal)) {
			animalsList.remove(animal);
			System.out.println("Animal " + animal.getName() + " has been removed from the Shelter!");
		} else
			System.out.println("The animal " + animal.getName() + "  is not found in the shelter!");
	}

	// method to list the animals
	public String listOfAnimals() {
		String list = "List of animals: ";
		for (Animal animal : animalsList) {
			list += animal.getName();
			list += ", ";
		}
		return list;
	}

	@Override // toString method
	public String toString() {
		return "Shelter [getAnimals()=" + getAnimals() + ", listOfAnimals()=" + listOfAnimals() + ", toString()="
				+ super.toString() + "]";
	}
}
