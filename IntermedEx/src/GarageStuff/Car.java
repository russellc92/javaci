package GarageStuff;

public class Car extends Vehicle {
	
	int doorsAmt;
	boolean spareTire;
	
	public Car(int id, boolean run, String nameof, int wheelNo, int doorsNo, boolean hasSpareTire)
	{
		super(id,run,nameof,wheelNo);
		this.doorsAmt = doorsNo;
		this.spareTire = hasSpareTire;
	}

	public int getDoorsAmt() {
		return doorsAmt;
	}

	public boolean isSpareTire() {
		return spareTire;
	}
	

}
