package LibraryTDD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Library {

	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	public static ArrayList<Item> libItems = new ArrayList<Item>();
	
	
	public static HashMap<Integer, ArrayList<Integer>> customerItems = new HashMap<Integer, ArrayList<Integer>>();
	
	public static void handleNewItem(CustomerController custCont, ItemController itemCont)
	{
		int newItemChoice = 0;
		Scanner scano = new Scanner(System.in);
		
		System.out.println("\n\nAdd book = type 1 and enter. \n"
				+ "Add Journal = type 2 and enter \n"
				+ "Add Dissertation = type 3 and enter \n"
				+ "Add thesis = type 4 and enter \n"
				+ "Go back = type 5 and enter: ");
		newItemChoice = scano.nextInt(); 
		switch (newItemChoice)
		{
		case 1: 	// new book
			scano = new Scanner(System.in);
			System.out.println("Book Name: ");
			String bookName = scano.nextLine();
			System.out.println("Author Name: ");
			String uathname = scano.nextLine();
			System.out.println("ISBN: ");
			String isbn = scano.nextLine();
			System.out.println("Book Genre: ");
			String genre = scano.nextLine();
			System.out.println("Description: ");
			String desc = scano.nextLine();
			System.out.println("Page Count: ");
			int pgc = scano.nextInt();
			int items = Library.libItems.size() + 1;
			Book newItem = new Book(uathname,isbn,genre, items, desc, bookName, pgc);
			itemCont.addItemToStore(newItem);
			break;
		case 2: 	// new Journal
			System.out.println("Journal Name: ");
			String journName = scano.nextLine();
			System.out.println("Publisher Name: ");
			String pubName = scano.nextLine();
			System.out.println("Catagory: ");
			String cat = scano.nextLine();
			System.out.println("Description: ");
			String journDesc = scano.nextLine();
			
			System.out.println("Page Count: ");
			int jpgc = scano.nextInt();
			System.out.println("Issue Number: ");
			int issueNo = scano.nextInt();
			int jitems = Library.libItems.size() + 1;
			Journal newJour = new Journal(jitems,journDesc,journName,jpgc,pubName,cat,issueNo);
			itemCont.addItemToStore(newJour);
			break;
		case 3: 	// new dissertation
			System.out.println("Dissertation Name: ");
			String dissName = scano.nextLine();
			System.out.println("Writer Name: ");
			String writer = scano.nextLine();
			System.out.println("Study field: ");
			String study = scano.nextLine();
			System.out.println("Description: ");
			String dissDesc = scano.nextLine();
			System.out.println("Project part of: ");
			String proj = scano.nextLine();
			
			System.out.println("Page Count: ");
			int dpgc = scano.nextInt();
			int ditems = Library.libItems.size() + 1;
			Dissertation newDisso = new Dissertation(ditems,dissDesc,dissName,
					dpgc,writer,study,proj);
			itemCont.addItemToStore(newDisso);
			break;
		case 4:		// new thesis
			System.out.println("Thesis Name: ");
			String thesName = scano.nextLine();
			System.out.println("Writer Name: ");
			String thesWriter = scano.nextLine();
			System.out.println("Study field: ");
			String thesField = scano.nextLine();
			System.out.println("Description: ");
			String thesDesc = scano.nextLine();

			System.out.println("Page Count: ");
			int tpgc = scano.nextInt();
			System.out.println("(boolean) Is it proved? : ");
			boolean theProoved = scano.nextBoolean();
			
			int titems = Library.libItems.size() + 1;
			Thesis newThs = new Thesis(titems,thesDesc,thesName,tpgc,thesWriter,theProoved,thesField);
			itemCont.addItemToStore(newThs);
			break;
		case 5:			
			break;
		default:
			System.out.println("Try again \n");
		}
	}
}
