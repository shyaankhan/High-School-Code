import java.lang.reflect.Array;

//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author Shyaan
 *
 */
public class HayStack {
	
		public static int findNeedle(String[] arrHayStack)
		{
			
	
			int index = 0;
			
			for(int i = 0; i<=arrHayStack.length; i++)
			{
				if(arrHayStack[i].equals("needle"))
				{
					index = i;
					return index;
				}
				
			}
			return index;
			
		}

		public static String[] modifyHayStack(String[] array)
		{
			String [] newArray = new String [array.length];
			for(int i = 0; i<array.length; i++)
			{
				if(array[i].equals("needle"))
				{
					array[i]= "found";
				}
				else
				{
					array[i] = "Hay";
				}
			}
			return array;
		}

}

