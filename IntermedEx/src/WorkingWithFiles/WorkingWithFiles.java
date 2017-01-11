package WorkingWithFiles;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class WorkingWithFiles {

	public static void main(String[] args) {

		Person Dave = new Person(21, "David Davidson", "SoftwareEngineer" );
		Person Betty = new Person(24, "Betty Bettysoon", "Pilot" );
		Person Keith = new Person(33, "Keith Vaz", "MP" );
		Person Susan = new Person(45, "Susan Susanson", "Teacher" );
		Person Kitty = new Person(69, "Kitty Food", "OfficeBike" );
		ArrayList<Person> PeopleList = new ArrayList<Person>();
		PeopleList.add(Dave); PeopleList.add(Kitty); PeopleList.add(Betty); PeopleList.add(Keith); PeopleList.add(Susan);

		ArrayListToFile toFile = new ArrayListToFile();

		try {
			toFile.ArrayToFile(PeopleList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Person> fileToArray = new ArrayList<Person>();
		//Get the people from the file and put into array below
		try {
			 fileToArray = toFile.FileToArray("C:/Users/Administrator/workspace/IntermedEx/PeopleList.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Prints the size of the arraylist just to prove the file contents were added
		int j = fileToArray.size();
		System.out.println(j);
	}
}
