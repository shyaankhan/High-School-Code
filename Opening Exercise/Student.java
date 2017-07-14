//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------/
// ****************************************************************
//  Student.java
//
//  Define a student class that stores name, score on test 1, and
//  score on test 2.  Methods prompt for and read in grades, 
//  compute the average, and return a string containing student ’s info. 
//****************************************************************
import java.util.Scanner;

public class Student
{
   //declare instance data 
	private String name;
	private int test1Score, test2Score;
	private double average;
	private int id;

   //-----------------------------------------------
   //constructor
   //-----------------------------------------------
   public Student(String studentName, int idIn)
   {
	//add body of constructor
   	name = studentName;
   	id = idIn;
   }
   Scanner kb = new Scanner(System.in);
   //-----------------------------------------------
   //inputGrades: prompt for and read in student's grades for test1 and test2.
   //Use name in prompts, e.g., "Enter's Joe's score for test1".
   //-----------------------------------------------
   public void inputGrades()
   {
   	System.out.print("Enter " + name + "'s score for test 1: ");
   	int test1Score = kb.nextInt();
   	System.out.print("Enter " + name + "'s score for test 2: ");
   	int test2Score = kb.nextInt();
   }
/*   public void displayGrades()
   {
   	System.out.println("Test 1: " + test1Score);
   	System.out.println("Test 2: " + test2Score);
   }
   An attempt to debug.
*/   
   //-----------------------------------------------
   //getAverage: compute and return the student's test average
   //-----------------------------------------------
   public double getAverage()
   {
   	average = (test1Score + test2Score) / 2;
   	return average;
   }
   //-----------------------------------------------
   //getName: print the student's name
   //----------------------------------------------
   //add header for printName

   public String getName()
   {
   	return name;
 
   }
   public String toString()
   {
   	return "Name: " + name + "\tTest 1: " + test1Score + "\tTest 2: " + test2Score + "\tid " +id; 
   }
   
 
}

