package LibraryTDD;

public class Customer implements InfoPrint{
	private int customerID;
	private String name;
	
	public Customer(int cID, String cName)
	{
		this.customerID = cID;
		this.name = cName;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}
	
	public void outputPrint()
	{	// From InfoPrint Interface
		
		System.out.println("Name: " + this.name + ", CustomerID: "+ this.customerID);
		
	}
	
}
