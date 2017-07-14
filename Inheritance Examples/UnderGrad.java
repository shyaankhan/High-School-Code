//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class UnderGrad extends  Student
{
      public UnderGrad( )      // default constructor
         {  super ( )  ; }
 
//constructor
        public UnderGrad(String name, int [] tests, String grade)
              { super(name, tests, grade ); }

 public void computeGrade() 
  { 
       if (getTestAverage() >= 70)
             setGrade("Pass");
        else
             setGrade("Fail");
   }
}
