//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */

//Gradstudent is a subclass of Student since GradStudent is a Student

public class GradStudent extends Student
{
     private int myGradID; 
   
     public GradStudent()    //default constructor
     {
        super(); 
        myGradID = 0;
    
         }
    //constructor:
       public GradStudent(String name, int[] tests, String grade, int gradID)
          {
                     super(name, tests, grade); 

                      myGradID = gradID; 

          }
       
       public int getID()
       {return myGradID;}

public void computeGrade()
{
    //invoke computeGrade in Student superclass
      super.computeGrade(); 
     if (getTestAverage() >= 90)
        setGrade("Pass");

}
}

       