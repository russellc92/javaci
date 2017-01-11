package GarageStuff;

public class Van extends Vehicle{
	
	int volumeCap;
	public Van(int id, boolean run, String nameof, int wheelNo, int volume)
	{
		super(id,run,nameof,wheelNo);
		this.volumeCap = volume;
	}
	public int getVolumeCap() {
		return volumeCap;
	}
	
	

}
