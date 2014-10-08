import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main
	{
	static  int numberOfGroups; 
	static int counter =0; 
 static ArrayList<Student>listOfStudents = new ArrayList<Student>(); 

	
	 public static void main(String[] args) throws IOException
		{
		Student.readDataFile(); 
		System.out.println("How many groups do you want?");
		Scanner userInput = new Scanner(System.in); 
		numberOfGroups = userInput.nextInt()+1; 
		organizeGroupZero(); 
		Collections.sort(listOfStudents, new GroupSorter());
		System.out.println(listOfStudents);
		Students.
		}
//	ask the user how many groups wanted 
//	create groups ArrayList
	 
	 //public static void groupSorter()
			{
			counter =0; 
			do
				{
				for(int i=1; i<numberOfGroups; i++)
					{
				listOfStudents.get(counter).setGroup(i);
				counter++;
					}
				}
			while(counter<listOfStudents.size()); 
			}
	 //public static void nameSorter()
		 {
		 
		 }
			
	 
public static  void organizeGroupZero()
		{
		Collections.sort(listOfStudents, new ScoreSorter());
		nameSorter();
		groupSorter(); 
		}
}
 