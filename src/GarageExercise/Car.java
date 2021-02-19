package GarageExercise;

public class Car extends Vehicle {

	private String boot;

	public Car(int id, String make, String colour, int wheels, int seats, int year, String boot) {
		super(id, make, colour, wheels, seats, year);

		this.setBoot(boot);

	}

	public String getBoot() {
		return boot;
	}

	public void setBoot(String boot) {
		this.boot = boot;
	}

}
