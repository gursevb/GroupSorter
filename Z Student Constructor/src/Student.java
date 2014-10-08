import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Student
	{
	private String firstName; 
	private String lastName; 
	private double score; 
	private int group; 

	public Student (String f, String l, double s, int g)
		{
		firstName = f; 
		lastName = l; 
		score = s; 
		group = g; 
		}

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public double getScore()
		{
		return score;
		}

	public void setScore(double score)
		{
		this.score = score;
		}

	public int getGroup()
		{
		return group;
		}

	public void setGroup(int group)
		{
		this.group = group;
		}

	public static void readDataFile() throws FileNotFoundException
		{
		Scanner file = new Scanner( new File( "classroster.txt" ) );
		
		 int numberOfLinesOfData = file.nextInt(); 
		 
		 for(int i=0; i<numberOfLinesOfData; i++)
				 {
				String firstName = file.next();
				String lastName = file.next();
				double score = file.nextDouble();
				Main.listOfStudents.add(new Student(firstName, lastName, score, 0)); 
				 }	
			}

	@Override
	public String toString()
		{
		return "Name: " + firstName + " " + lastName + " " + "\nGroup: " + group + "\n" ; 
		}
	}
	

// instantiate an ArrayList
// create a Student Constructor
// firstName, lastName, score, group
// instantiate a Scanner Object
// read number of lines
// for loop 0-numberOfLines
// firstName = file.next()
// lastName = file.next()
// score = filenextDouble()
// add the students into the ArrayList
//
// ask the user how many groups wanted
// create groups ArrayList
// Collections.sort(gradebook, new ScoreSorter());