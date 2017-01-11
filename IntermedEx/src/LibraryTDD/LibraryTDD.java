package LibraryTDD;
import java.util.Scanner;

public class LibraryTDD {

	public static void main(String[] args) {

		//Library lib = new Library();

		CustomerController custCont = new CustomerController();
		ItemController itemCont = new ItemController();

		////////// ADDING CUSTOMERS
		custCont.registerCustomer(1, "Russell"); // addind a customer via values
		System.out.println(Library.customerList.size());

		Customer cust = new Customer(2, "Geoff");
		custCont.registerCustomer(cust); // adding a customer via customer object
		Customer custy = new Customer(3, "Chris");
		custCont.registerCustomer(custy); // adding a customer via customer object
		Customer custyy = new Customer(4, "Dave");
		custCont.registerCustomer(custy); // adding a customer via customer object

		System.out.println(Library.customerList.size());

		// Using the customer fucntions
		custCont.deleteCustomer(3); // deleting Chris from above, via int id
		custCont.deleteCustomer(custyy); // Deletes Dave from above, via obj

		custCont.updateCustomer(2, "Jeff"); // changing geoff to jeff va id
		custCont.updateCustomer(cust); // changing jeff back geoff

		/////////// ADDING ITEMS
		Book newBook = new Book("Steve", "3213", "Comedy", 1,
				"funny-book","HAHAJOKES", 54);
		itemCont.addItemToStore(newBook);

		Journal newJourn = new Journal(2,"journal-of-law", "TheLawJournal", 99,
				"lawyer lawyerson", "Law", 12);
		itemCont.addItemToStore(newJourn);

		Dissertation newDiss = new Dissertation(3,"to find the higgs boson","higgs boson",
				55,"Gary", "Physics", "The higs project");
		itemCont.addItemToStore(newDiss);

		Thesis newThes = new Thesis(4,"study of computing","does computing exist",
				46,"felix",true,"computing");
		itemCont.addItemToStore(newThes);

		// using the item fucntions
		// updating items
		itemCont.updateItem(2, "new desc"); // Changing the above journal desc to this,
		itemCont.updateItem(newJourn); // chaning back desc to original via obj

		// removing items
		itemCont.addItemToStore(new Book("tempbook", "5555", "lol", 5,
				"book","meh", 44)); // temp boko so i can show remove
		itemCont.removeItem(5);

		Book tempBOOK = new Book("tempbook2", "5556", "lol", 5,
				"book","meh", 44);
		itemCont.addItemToStore(tempBOOK); // temp boko so i can show remove
		itemCont.removeItem(tempBOOK); // now removing it agains

		////////////////////////////////////////////////////////////////////////

		// Showing one of the interfaces method, with its derived methods in book/Journal/Dissertation/thesis
		InfoPrint innn = newBook;
		innn.outputPrint();
		innn = newJourn;
		innn.outputPrint();
		innn = newDiss;
		innn.outputPrint();
		innn = newThes;	
		innn.outputPrint();

		//////////////////////////////////////////////////////////////////////////

		// assigning items to cosutomers, you are able to add multiple items to one customer if u want

		itemCont.checkOutItem(2, 1);
		itemCont.checkOutItem(3, 1);
		itemCont.checkOutItem(4, 2);
		itemCont.checkOutItem(1, 2);

		////////////////////////////////////////////////////////////////////////////
		// Interface tasks

		boolean finished = false; int userChoice = 0;
		Scanner scano = new Scanner(System.in);
		while(!finished)
		{
			switch(userChoice)
			{
			case 1:
				scano = new Scanner(System.in);
				System.out.println("Customer Name: ");
				String newName = scano.nextLine();
				int size = Library.customerList.size()+1;
				custCont.registerCustomer(size, newName);
				userChoice = 0;
				
				innn = new Customer(size, newName);
				innn.outputPrint(); // to prove new customer was added and prints it from interface class
				
				break;
			case 2:
				Library.handleNewItem(custCont, itemCont);
				userChoice = 0;
				break;
			case 3:
				finished = true;
				break;
			case 0: // i dont know why i did this, but its here 
				System.out.println("\n\nAdd Customer = type 1 and enter. \n"
						+ "Add Item = type 2 and enter \n"
						+ "Quit = type 3 and enter: ");
				userChoice = scano.nextInt(); 
				break;
			default: 	//
				break;	//			
			}
		} 
		scano.close();
	}
}
