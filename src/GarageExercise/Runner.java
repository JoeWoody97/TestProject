package GarageExercise;

public class Runner {

	public static void main(String[] args) {

		// creating the garage
		Garage theGarage = new Garage();

		// creating the vehicles
		Car car1 = new Car(1, "BMW", "Black", 4, 5, 2016, "large");
		Car car2 = new Car(2, "Audi", "Grey", 4, 5, 2019, "Small");
		Motorbike motorbike1 = new Motorbike(3, "Honda", "Red", 2, 1, 2010, "Chrome");
		Lorry lorry1 = new Lorry(4, "Volvo", "Green", 8, 2, 2020, "Detachable");

		// adding the vehicle to the garage
		theGarage.addVehicle(car1);
		theGarage.addVehicle(car2);
		theGarage.addVehicle(motorbike1);
		theGarage.addVehicle(lorry1);

		// removing the vehicle from the garage
		theGarage.removeVehicle(2);

		// fixing a vehicle
		theGarage.fixVehicle(car2);

		// calculating the total bill of the garage
		int totalGarageBill = theGarage.billCalc();
		System.out.println("The total bill in the garage is " + totalGarageBill);

	}

}
