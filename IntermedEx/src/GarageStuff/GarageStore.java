package GarageStuff;

import java.util.ArrayList;
import java.util.List;

public class GarageStore {

	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public GarageStore(List<Vehicle> vehicleParams)
	{
		this.vehicles = vehicleParams;
	}
	
	
	// TO-DO
	public double calculateBill(Vehicle vehic)
	{
		// Create a method in Garage that iterates through each Vehicle, 
		// calculating a bill for each type of Vehicle in a different way, depending on the type of vehicle it is.
		double billTotal = 1000.00;
		if(vehic instanceof Car)
		{ 
			Car bCar = (Car)vehic;
			billTotal+= (double)bCar.getWheels();
			billTotal+= (double)bCar.getDoorsAmt();
			if(bCar.isSpareTire())
				billTotal+= 12.50;
			
		}
		if(vehic instanceof Van)
		{
			Van bVan = (Van)vehic;
			billTotal += (double)bVan.getVolumeCap(); // vans be expensive
		}
		if(vehic instanceof Motorbike)
		{
			Motorbike bMotor = (Motorbike)vehic;
			if(bMotor.hasSideCar)
				billTotal += 5525.50;
		}
		return billTotal;
	}
	
	
	public void addVehicle(Vehicle vehic)
	{
		//add to list
		this.vehicles.add(vehic);
		
	}
	public boolean removeVehicle(int idDel)
	{	// rem from list by ID. returns bool if successful
		int index = 0;
		for(Vehicle v : this.vehicles)
		{
			if(v.getID() == idDel)
			{	
				this.vehicles.remove(index);
				return true;
			}
			index++;
		}
		return false;
	}
	public boolean removeVehicle(String nameDel)
	{ // overloaded removeVehicle function for type name
		int index = 0;
		for(Vehicle v : this.vehicles)
		{
			if(v.getName().equals(nameDel))
			{	
				this.vehicles.remove(index);
				return true;
			}
			index++;
		}
		return false;
	}
	public double fixVehicle(Vehicle vehicBill)
	{
		// uses the calculateBill method and just returns its double
		return this.calculateBill(vehicBill);
	}
	public void emptyGarage()
	{	// clear the list
		this.vehicles.clear();		
	}
	
	
}
