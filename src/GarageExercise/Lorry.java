package GarageExercise;

public class Lorry extends Vehicle {

	private String trailer;

	public Lorry(int id, String make, String colour, int wheels, int seats, int year, String trailer) {
		super(id, make, colour, wheels, seats, year);

		this.setTrailer(trailer);

	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

}
