package LibraryTDD;

import java.util.ArrayList;

public class CustomerController implements CheckController{
	
	// Public variables
	//ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	// HASHMAP HERE

	// Public customer methods
	public void registerCustomer(Customer cust){
		Library.customerList.add(cust);		
	}
	public void registerCustomer(int id, String name){
		Customer cust = new Customer(id,name);
		Library.customerList.add(cust);		
	}
	
	public void deleteCustomer(Customer cust){
		int id = cust.getCustomerID();
		int idx = 0;
		for(Customer c : Library.customerList)
		{
			if(id == c.getCustomerID())
			{
				Library.customerList.remove(idx);
				break;
			}
			idx++;
		}
		
		// also change hashmap
	}
	public void deleteCustomer(int id){
		
		int idx = 0;
		for(Customer c : Library.customerList)
		{
			if(id == c.getCustomerID())
			{
				Library.customerList.remove(idx);
				break;
			}
			idx++;
		}
		
	}
	
	public void updateCustomer(Customer cust){
		String newName = cust.getName();
		int id = cust.getCustomerID();
		for(int i = 0;i<Library.customerList.size(); i++)
		{
			if(id == Library.customerList.get(i).getCustomerID())
				Library.customerList.get(i).setName(newName);
		}
		
	}
	public void updateCustomer(int id, String name){		
		for(int i = 0;i<Library.customerList.size(); i++)
		{
			if(id == Library.customerList.get(i).getCustomerID())
				Library.customerList.get(i).setName(name);
		}		
	}

	////////////////////////////////////////////////////////
	
	// Public Methods for checking in item
	public void checkInItem(int id, int custID){
		ArrayList<Integer> items = new ArrayList<Integer>();
		if(Library.customerItems.containsKey(custID)){
			items = Library.customerItems.get(custID);	
			for(int i = 0; i < Library.customerItems.get(custID).size(); i++)
			{
				if(id == items.get(i)){
					items.remove(i);
					Library.customerItems.put(custID, items);
					break;
				}
			}
		}
	}
	public void checkOutItem(int id, int custID){
		ArrayList<Integer> items = new ArrayList<Integer>();
		if(Library.customerItems.containsKey(custID))
		{	// add item to existing customer record
			Library.customerItems.get(custID).add(id);
		}
		else
		{ 	// create new customer record and add item.
			items.add(id);
			Library.customerItems.put(custID, items);
		}
	}
	public void checkInItem(Item item, int custID){
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
	
}
