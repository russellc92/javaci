package LibraryTDD;

public class Dissertation extends Item{

	String Writer;
	String studyField;
	String project;
	
	public Dissertation(int idd, String desc, String titl, int pgc, String writ, String stud, String proj)
	{
		this.Writer = writ;
		this.studyField = stud;
		this.project = proj;
		
		this.itemID = idd;
		this.description = desc;
		this.title = titl;
		this.pageCount = pgc;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getStudyField() {
		return studyField;
	}

	public void setStudyField(String studyField) {
		this.studyField = studyField;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
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
		System.out.println("Type: Book, Writer: " + this.Writer + ", ItemID: " + this.itemID + ", Title: " + this.title);
		
		
	}
}
