package LibraryTDD;

public interface CheckController {

	public void checkOutItem(Item item, int custID);
	public void checkInItem(Item item, int custID);
	
	public void checkOutItem(int itemID, int custID);
	public void checkInItem(int itemID, int custID);
	
}
