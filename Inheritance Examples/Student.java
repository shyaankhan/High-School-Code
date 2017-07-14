//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class Student
{
//data members (instance fields)
public final static int NUM_TESTS = 3;   
private String myName;
private int [] myTests;  
private String myGrade;


//constructors (2 constructors defined)
public Student( ) 
{
    myName = " ";    
    myTests = new int [NUM_TESTS];
    myGrade =  " "; 
}
public Student(String name, int[]tests, String grade)
{ myName= name; 
  myTests = tests;
  myGrade = grade;
} 

 public String getName( )
{ return myName; }

 public String getGrade ( )
{ return myGrade; } 

 public void setGrade (String newGrade)
{ myGrade =  newGrade; }

 public void computeGrade() 
{
   if (myName .equals (""))
       myGrade = "No grade";
else if (getTestAverage( ) >= 65)
       myGrade =  "Pass";
else
       myGrade = "Fail";
}
 
 
 public double getTestAverage( ) 
{
      double total = 0;
     for (int score: myTests)
          total += score;
      return total/NUM_TESTS;

     /*  for (int i=0; i<NUM_TESTS; i+ +)
            total += myTests[i];
        return total/NUM_TESTS;*/

       }
}
