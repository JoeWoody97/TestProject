package objects;

public class Dog {

	// instance variables
	public String name;
	public int age;
	public String breed;
	public String colour;
	public String owner;

	// Constructor - makes objects (dogs in this instance)
	public Dog(String name, int age, String breed, String colour, String owner) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.colour = colour;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "My name is " + name + ", I am " + age + " years old. I am a " + colour + " " + breed
				+ " and I love my owner " + owner + " very much!";
	}

}
