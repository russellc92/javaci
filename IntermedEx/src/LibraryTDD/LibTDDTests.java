package LibraryTDD;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LibTDDTests {

	@Test
	public void ItemControllerTests() {
		//fail("Not yet implemented");
	
		ItemController IC = new ItemController();
		Book book = new Book("Dave", "134678", "comedy", 1, "ok", "harry potter", 625);
		Library lib = new Library();
		
		IC.addItemToStore(book);
		assertNotNull("Not added to library",lib.libItems.get(0));
		
		IC.removeItem(1); // removes book from above via its ID
		assertTrue("item not removed",lib.libItems.isEmpty());
		
		IC.addItemToStore(book);
		IC.removeItem(book); // removes book from above but via book object this time
		assertTrue("item not removed",lib.libItems.isEmpty());
//		lib.libItems.get(0)
		
		IC.addItemToStore(book);
		IC.updateItem(1, "foobar"); // updates the desc of book at id 1
		assertEquals("Didnt update - via item",lib.libItems.get(0).getDescription(),"foobar");
		
		book.setDescription("fizzbang"); // alter this book for update via item
		IC.updateItem(book); // updates the desc of book
		assertEquals("Didnt update - via item",lib.libItems.get(0).getDescription(),"fizzbang");
		
		///////////////////////////////
		// Check out item test
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1); testArray.add(2); testArray.add(3);
		lib.customerItems.put(1, testArray);
		
		IC.checkOutItem(4, 1); // itemid of 4, customer id of 1
		assertEquals("did not check out - ic", lib.customerItems.get(1).size(),4);
		
		Book bookTwo = new Book("Dave", "134678", "comedy", 5, "ok", "harry potter", 625);
		IC.checkOutItem(bookTwo, 1); // bokoTwo, id of 5 check out for customer ith id 1
		assertEquals("did not check out - ic", lib.customerItems.get(1).size(),5);
		
		// Check In Item test
		
		IC.checkInItem(bookTwo, 1);
		assertEquals("did not check in - ic", lib.customerItems.get(1).size(),4);
		
		IC.checkInItem(4, 1);
		assertEquals("did not check in - ic", lib.customerItems.get(1).size(),3);
		
		
	}
	@Test
	public void CustomerControllerTests() {

		CustomerController CC = new CustomerController();
		Library lib = new Library();
		Customer testCust = new Customer(1,"Dave");
		
		CC.registerCustomer(testCust);
		assertEquals("Cust not registered",lib.customerList.get(0).getCustomerID(),1);
	
		CC.registerCustomer(2,"Colin");
		assertEquals("Cust not registered",lib.customerList.get(1).getCustomerID(),2);
		

		assertEquals("wut",lib.customerList.size(),2);
		CC.deleteCustomer(2);
		assertEquals("no delete",lib.customerList.size(),1);
		CC.deleteCustomer(testCust);
		assertEquals("no delete",lib.customerList.size(),0);		
		
		
		CC.registerCustomer(testCust);
		CC.updateCustomer(1, "Elliott");
		assertEquals("not updated",lib.customerList.get(0).getName(),"Elliott");
		testCust.setName("Russ");
		CC.updateCustomer(testCust);
		assertEquals("not updated",lib.customerList.get(0).getName(),"Russ");
		
		
		////////////////////////////////////////////////////
		
		// Check out item test
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1); testArray.add(2); testArray.add(3);
		lib.customerItems.put(1, testArray);
		
		
		CC.checkOutItem(4, 1); // itemid of 4, customer id of 1
		assertEquals("did not check out - ic", lib.customerItems.get(1).size(),4);
		
		Book bookTwo = new Book("Dave", "134678", "comedy", 5, "ok", "harry potter", 625);
		CC.checkOutItem(bookTwo, 1); // bokoTwo, id of 5 check out for customer ith id 1
		assertEquals("did not check out - ic", lib.customerItems.get(1).size(),5);
		
		// Check In Item test
		
		CC.checkInItem(bookTwo, 1);
		assertEquals("did not check in - ic", lib.customerItems.get(1).size(),4);
		
		CC.checkInItem(4, 1);
		assertEquals("did not check in - ic", lib.customerItems.get(1).size(),3);
		
	}
}