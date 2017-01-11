package LibraryTDD;

public class Book extends Item{

	String author;
	String ISBN;
	String Genre;
	
	//id,desc,title,pg
	
	public Book(String auth, String isbnNo,String gen,
			int idd, String desc, String titl, int pgc)
	{
		this.author = auth;
		this.ISBN = isbnNo;
		this.Genre = gen;
		
		this.itemID = idd;
		this.description = desc;
		this.title = titl;
		this.pageCount = pgc;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}
	
	/////////////////////////////////////////////
	
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
	///////////////////////////////////////////////////////
	
	
	public void outputPrint()
	{	// From InfoPrint Interface
		
		System.out.println("Type: Book, Author: " + this.author + ", ItemID: " + this.itemID + ", Title: " + this.title);
		
		
	}
	
}
