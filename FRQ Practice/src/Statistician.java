//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author Shyaan
 *
 */
import java.util.Arrays;

public class Statistician
{
  // Part (a)

  /** Returns an array of the values obtained by tossing a number cube numTosses times.
   *  @param cube a NumberCube
   *  @param numTosses the number of tosses to be recorded
   *         Precondition: numTosses > 0
   *  @return an array of numTosses values
   */
  public static int[] getCubeTosses(NumberCube cube, int numTosses)
  {
	  int[] newArray = new int[numTosses];
		for (int i = 0; i<numTosses;  i++)
		{
			newArray[i] = cube.toss();
		}	
		return newArray;		//I tried returning a variable modifyed in a for loop
								//in another code, and it didn't work. 
								//Why is it working here?
		

  }

  // *************************************************

  // Part (b)

  /** Returns the starting index of a longest run of two or more consecutive repeated values
   *  in the array values.
   *  @param values an array of integer values representing a series of number cube tosses
   *         Precondition: values.length > 0
   *  @return the starting index of a run of maximum size;
   *          -1 if there is no run
   */
  public static int getLongestRun(int [] value)
  {
  int result = 0;
  int maxLen = 0;
  int maxStart = 0;

  	for(int i = 0; i<value.length-1; i++)
  	{
  		if(value[i] == value[i+1])
  		{
  			result++;
  			if (result > maxLen)
  			 {
  				maxLen = result;
   				maxStart = i - result + 1;
   			 }
   		}
  		else
   		{
   			result = 0;
   		}
   	}
   return maxStart;
  }
  
  
  //This whole code is a little hard for me to comprehend


  // *************************************************

  public static void main(String[] args)
  {
    NumberCube cube = new NumberCube();
    for (int count = 1; count < 10; count++)
    {
      int[] values = getCubeTosses(cube, 18);
      int maxRunStart = getLongestRun(values);
      System.out.println(Arrays.toString(values) + " ==> " + maxRunStart);
    }
  }
}

