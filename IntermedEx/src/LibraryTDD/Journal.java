package LibraryTDD;

public class Journal extends Item{

	String Publisher;
	int issueNo;
	String Catagory;
	
	public Journal(int idd, String desc, String titl, int pgc, String pub, String Cat, int iss)
	{
		this.Publisher = pub;
		this.issueNo = iss;
		this.Catagory = Cat;
		
		this.itemID = idd;
		this.description = desc;
		this.title = titl;
		this.pageCount = pgc;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}

	public String getCatagory() {
		return Catagory;
	}

	public void setCatagory(String catagory) {
		Catagory = catagory;
	}
	/////////////////////////////////////////////////
	
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemIDD) {
		itemID = itemIDD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String ddescription) {
		description = ddescription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String ttitle) {
		title = ttitle;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int ppageCount) {
		pageCount = ppageCount;
	}
	
	/////////////////////////////////////////////////
	public void outputPrint()
	{
		System.out.println("Type: Book, Publisher: " + this.Publisher+ ", ItemID: " + this.itemID + ", Title: " + this.title);
	}
	
}
