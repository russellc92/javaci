package LibraryTDD;

public class Thesis extends Item {

	String writer;
	boolean prooved;
	String field;
	
	public Thesis(int idd, String desc, String titl, int pgc, String writ, boolean proovd, String tField)
	{
		this.writer = writ;
		this.prooved = proovd;
		this.field = tField;
		
		this.itemID = idd;
		this.description = desc;
		this.title = titl;
		this.pageCount = pgc;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public boolean isProoved() {
		return prooved;
	}

	public void setProoved(boolean prooved) {
		this.prooved = prooved;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	///////////////////////////////////////////////////////////
	
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
	
	/////////////////////////////////////////////////////////
	public void outputPrint()
	{
		System.out.println("Type: Book, Writer: " + this.writer + ", ItemID: " + this.itemID + ", Title: " + this.title);
	}
	
}
