package GarageExercise;

public class Motorbike extends Vehicle {

	private String handleBars;

	public Motorbike(int id, String make, String colour, int wheels, int seats, int year, String handleBars) {
		super(id, make, colour, wheels, seats, year);

		this.setHandleBars(handleBars);

	}

	public String getHandleBars() {
		return handleBars;
	}

	public void setHandleBars(String handleBars) {
		this.handleBars = handleBars;
	}

}
