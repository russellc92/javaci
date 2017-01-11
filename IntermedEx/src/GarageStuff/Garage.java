package GarageStuff;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static void main(String[] args) {
		// int id, boolean run, String nameof, int wheelNo, boolean sideCar, String plate
		// Class Definitions
		Motorbike motorbikeVi = new Motorbike(5, true, "Steve", 2, false, "abcdef");
		Car carVi = new Car(6, true, "Geoff", 4, 5, true);
		Van vanVi = new Van(12, true, "Colin", 4, 87856);
		// List Definition
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		// vechile add to list
		vehicles.add(carVi);
		vehicles.add(vanVi);
		vehicles.add(motorbikeVi);
		
		
		
		// Garage part of the Task
		GarageStore GarageVehicles = new GarageStore(vehicles);
		
		// add vehic
		Van anotherVan = new Van(15, true, "ObiVan", 4, 402);
		Motorbike anotherBike = new Motorbike(16, true, "Gregg", 2, false, "qetbut");
		Motorbike anotherOneBike = new Motorbike(17, true, "Jack", 2, true, "aylmao");
		GarageVehicles.addVehicle(anotherVan);
		GarageVehicles.addVehicle(anotherBike);
		GarageVehicles.addVehicle(anotherOneBike);
		
		// remove vehic (by id int)
		GarageVehicles.removeVehicle(15); // deletes the van above called ObiVan
		
		// remove vehic (by name string)
		GarageVehicles.removeVehicle("Gregg");
		
		// fix vehic
		double billAmounty = 00.00;
		billAmounty = GarageVehicles.fixVehicle(carVi);
		System.out.println(billAmounty);
		billAmounty = GarageVehicles.fixVehicle(vanVi);
		System.out.println(billAmounty);
		billAmounty = GarageVehicles.fixVehicle(motorbikeVi);	
		System.out.println(billAmounty);
		
		// empty garage
		GarageVehicles.emptyGarage(); 
			
	}

}
