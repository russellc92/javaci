package LibraryTDD;

public abstract class Item implements InfoPrint{

	int itemID;
	String description;
	String title;
	int pageCount;
	
	// public Item(int id,String desc, String titlee, int pageCnt)
	// {}
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	
	public void outputPrint()
	{	// From InfoPrint Interface
		
		// print out customer details, PROBS STILL BLANK HERE
		
	}
	
}
