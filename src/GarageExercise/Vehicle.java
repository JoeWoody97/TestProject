package GarageExercise;

public class Vehicle {

	// instance variables
	private int id;
	private String make;
	private String colour;
	private int wheels;
	private int seats;
	private int year;

	public Vehicle() {

	}

	// constructor
	public Vehicle(int id, String make, String colour, int wheels, int seats, int year) {
		this.id = id;
		this.make = make;
		this.colour = colour;
		this.wheels = wheels;
		this.seats = seats;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "This vehicle is a " + make + " which is " + colour + " and it was made in " + year + ". It has " + seats
				+ " seats and " + wheels + " wheels.";
	}

}
