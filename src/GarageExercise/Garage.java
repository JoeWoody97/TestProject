package GarageExercise;

import java.util.ArrayList;

public class Garage {

	// created Array list
	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	// method that adds the vehicles to the garage (ArrayList)
	public void addVehicle(Vehicle v) {

		vehicleList.add(v);
		System.out.println("The " + v.getMake() + " has been added to the Garage.");
		System.out.println(v.toString());
	}

	//
	public void removeVehicle(int id) {

		boolean vehicleFound = false;

		Vehicle toRemove = null;

		for (Vehicle v : vehicleList) {
			if (v.getId() == id) {
				vehicleFound = true;
				toRemove = v;
				System.out.println("The " + v.getMake() + " has been removed.");
				break;
			}
		}

		if (!vehicleFound) {
			System.out.println("We could not find the Vehicle.");
		} else {
			vehicleList.remove(toRemove);
		}
	}

	public void fixVehicle(Vehicle v) {

		System.out.println("We have fixed your " + v.getYear() + " " + v.getColour() + " " + v.getMake());

		int bill = 0;

		if (v instanceof Car) {
			bill += 100;
		} else if (v instanceof Motorbike) {
			bill += 50;
		} else if (v instanceof Lorry) {
			bill += 150;
		}
		System.out.println("Your total bill is: " + bill);
	}

	public void emptyGarage() {
		vehicleList.clear();
		System.out.println("The garage has been emptied.");
	}

	// method that calculates the total bill of all the vehicles in the garage
	public int billCalc() {

		int bill = 0;

		for (Vehicle v : vehicleList) {
			if (v instanceof Car) {
				bill += 100;
			} else if (v instanceof Motorbike) {
				bill += 50;
			} else if (v instanceof Lorry) {
				bill += 150;
			}
		}

		return bill;
	}

}
