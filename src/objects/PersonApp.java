package objects;

public class PersonApp {

	public static void main(String[] args) {

		Person person1 = new Person("Joe", 23, "Software dev");
		Person person2 = new Person("Phoebe", 22, "Software dev");
		Person person3 = new Person("Will", 18, "Lazy arse");

		person1.printPerson();
		person2.printPerson();

	}

}
