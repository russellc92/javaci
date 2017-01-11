package LibraryTDD;

import java.util.ArrayList;

public class ItemController implements CheckController{



	public void addItemToStore(Item item){

		// error checking? 
		Library.libItems.add(item);

	}

	public void removeItem(Item item){
		int idd = item.getItemID();
		for(int i = 0; i< Library.libItems.size(); i++)
		{
			if(idd == Library.libItems.get(i).getItemID())
			{
				Library.libItems.remove(i);
				break;
			}
		}		
	}
	public void removeItem(int itemID){
		for(int i = 0; i< Library.libItems.size(); i++)
		{
			if(itemID == Library.libItems.get(i).getItemID())
			{
				Library.libItems.remove(i);
				break;
			}			
		}		
	}
	public void updateItem(Item item){ // What a load of BS 
		int idd=item.getItemID();
		for(Item it : Library.libItems){
			if(idd == it.getItemID()){
				if(item instanceof Book)
				{
					((Book)it).setDescription(item.getDescription());
					((Book)it).setAuthor(((Book) item).getAuthor());
					((Book)it).setGenre(((Book) item).getGenre());
					((Book)it).setISBN(((Book) item).getISBN());
					((Book)it).setPageCount(item.getPageCount());
					((Book)it).setTitle(item.getTitle());
				}
				if(item instanceof Journal)
				{
					((Journal)it).setPageCount(item.getPageCount());
					((Journal)it).setTitle(item.getTitle());
					((Journal)it).setDescription(item.getDescription());
					((Journal)it).setCatagory(((Journal) item).getCatagory());
					((Journal)it).setIssueNo(((Journal) item).getIssueNo());
					((Journal)it).setPublisher(((Journal) item).getPublisher());

				}
				if(item instanceof Dissertation)
				{
					((Dissertation)it).setPageCount(item.getPageCount());
					((Dissertation)it).setTitle(item.getTitle());
					((Dissertation)it).setDescription(item.getDescription());				
					((Dissertation)it).setProject(((Dissertation) item).getProject());
					((Dissertation)it).setStudyField(((Dissertation) item).getStudyField());
					((Dissertation)it).setWriter(((Dissertation) item).getWriter());
				}
				if(item instanceof Thesis)
				{
					((Thesis)it).setPageCount(item.getPageCount());
					((Thesis)it).setTitle(item.getTitle());
					((Thesis)it).setDescription(item.getDescription());
					((Thesis)it).setField(((Thesis) item).getField());
					((Thesis)it).setProoved(((Thesis) item).isProoved());
					((Thesis)it).setWriter(((Thesis) item).getWriter());
				}
			}
		}

	}
	public void updateItem(int itemID, String description){ // only able to update the desc of an item via this overload
		for(Item it : Library.libItems){
			if(itemID == it.getItemID())
			{
				if(it instanceof Book)
				{
					((Book)it).setDescription(description);
				}
				if(it instanceof Journal)
				{
					((Journal)it).setDescription(description);
				}
				if(it instanceof Dissertation)
				{
					((Dissertation)it).setDescription(description);
				}
				if(it instanceof Thesis)
				{
					((Thesis)it).setDescription(description);
				}
			}
		}
	}
	///////////////////////////////////////////////////////////////	
	
	// Adds a record of the customer and their rental from teh library and stores in the HashMap via Item class 
	public void checkOutItem(Item item, int custID){
		// find if existing, if exist add to existm if not exist add new key with item
		ArrayList<Integer> items = new ArrayList<Integer>();
		if(Library.customerItems.containsKey(custID))
		{	// add item to existing customer record
			Library.customerItems.get(custID).add(item.getItemID());
		}
		else
		{ 	// create new customer record and add item.
			items.add(item.getItemID());
			Library.customerItems.put(custID, items);
		}		
	}
	//
	// 
	// Adds a record of the customer and their rental from teh library and stores in the HashMap via ints
	public void checkOutItem(int itemID, int custID){
		ArrayList<Integer> items = new ArrayList<Integer>();
		if(Library.customerItems.containsKey(custID))
		{	// add item to existing customer record
			Library.customerItems.get(custID).add(itemID);
		}
		else
		{ 	// create new customer record and add item.
			items.add(itemID);
			Library.customerItems.put(custID, items);
		}
	}
	
	public void checkInItem(Item item, int custID)
	{
		ArrayList<Integer> items = new ArrayList<Integer>();
		if(Library.customerItems.containsKey(custID)){
			items = Library.customerItems.get(custID);	
			for(int i = 0; i < Library.customerItems.get(custID).size(); i++)
			{
				if(item.getItemID() == items.get(i)){
					items.remove(i);
					Library.customerItems.put(custID, items);
					break;
				}
			}
		}
	}
	
	public void checkInItem(int itemID, int custID)
	{
		ArrayList<Integer> items = new ArrayList<Integer>();
		if(Library.customerItems.containsKey(custID)){
			items = Library.customerItems.get(custID);	
			for(int i = 0; i < Library.customerItems.get(custID).size(); i++)
			{
				if(itemID == items.get(i)){
					items.remove(i);
					Library.customerItems.put(custID, items);
					break;
				}
			}
		}
	
	}
}
