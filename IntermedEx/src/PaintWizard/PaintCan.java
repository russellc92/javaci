package PaintWizard;

public class PaintCan {

	String name;
	double price;
	double capacity;
	double coverageLitre;
	
	public PaintCan(String nameCan, double cost, double cap, double coverage)
	{
		this.name = nameCan;
		this.price = cost;
		this.capacity = cap;
		this.coverageLitre = coverage;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getCoverageLitre() {
		return coverageLitre;
	}
	
	
}
