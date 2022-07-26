
public class TestAnimal {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Twinnie");
		Cat cat2 = new Cat("Fred");
		Dog dog1 = new Dog("Bingo");
		Dog dog2 = new Dog("Jack");
		cat1.getGreets();
		dog1.getGreets();
		dog2.getGreets(dog1);
		System.out.println(cat1.toString());
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		
		Shelter shelter = new Shelter();
		shelter.addAnimal(cat2);
		shelter.addAnimal(cat1);
		shelter.addAnimal(dog1);
		shelter.addAnimal(dog2);
		System.out.println(shelter.listOfAnimals());
		shelter.removeAnimal(cat2);
		System.out.println(shelter.listOfAnimals());
		System.out.println(shelter.toString());
		
	}
}
