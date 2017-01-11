package WorkingWithFiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListToFile {

	public void ArrayToFile(ArrayList<Person> pepe) throws IOException
	{
		File logFile = new File("C:/Users/Administrator/workspace/IntermedEx/PeopleList.txt");
		FileOutputStream fww = new FileOutputStream(logFile,false);  

		String ageFromInt = "";
		String stringToFile = "";

		for(int i = 0; i < pepe.size(); i++){ // for each person in array, write to file via CSV
			// Turns the integer age into a string
			ageFromInt = Integer.toString(pepe.get(i).getAge()); 

			if(i != 0) // prevents blank line on first line of txt file
				stringToFile+= "\n";

			// Gets the person class attributes and puts them into a string separated by a comma (CSV)
			stringToFile += pepe.get(i).getName() + "," + ageFromInt + "," + pepe.get(i).getOccupation(); 
		}
		fww.write(stringToFile.trim().getBytes());
		fww.close();
	}

	public ArrayList<Person> FileToArray(String fileName) throws FileNotFoundException
	{
		ArrayList<String> fileLines = new ArrayList<String>();
		
		ArrayList<Person> fromFile = new ArrayList<Person>();
		
		FileInputStream frr = new FileInputStream(fileName);
		
		InputStream iss = (InputStream) frr;
		Scanner sc = new Scanner( iss );
		
		String line = "";
		while(sc.hasNextLine()){
			line = sc.nextLine();
			fileLines.add(line);
		}
		String [] Personss = new String[3];
		for(int i = 0; i<fileLines.size();i++)
		{
			Personss = fileLines.get(i).split(",");
			fromFile.add(new Person(Integer.parseInt(Personss[1]),Personss[0],Personss[2]));
		}
		return fromFile;
	}		
}
