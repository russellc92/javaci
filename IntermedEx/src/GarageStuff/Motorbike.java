package GarageStuff;

public class Motorbike extends Vehicle {
	
	boolean hasSideCar;
	String regPlate;
	
	public Motorbike(int id, boolean run, String nameof, int wheelNo, boolean sideCar, String plate)
	{
		super(id,run,nameof,wheelNo);
		this.hasSideCar = sideCar;
		this.regPlate = plate;
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public String getRegPlate() {
		return regPlate;
	}	
}
