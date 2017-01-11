package GarageStuff;

public class Vehicle {

	int vehicleID;
	boolean isRunning;
	String name;
	int wheels;
	
	public Vehicle(int id, boolean run, String nameof, int wheelNo)
	{
		super();
		this.vehicleID = id;
		this.isRunning = run;
		this.name = nameof;
		this.wheels = wheelNo;		
	}
	
	public int getID() {
		return this.vehicleID;		
	}
	public String getName()	{
		return this.name;		
	}
	public int getVehicleID() {
		return this.vehicleID;
	}
	public boolean isRunning() {
		return this.isRunning;
	}
	public int getWheels() {
		return this.wheels;
	}
	
}
