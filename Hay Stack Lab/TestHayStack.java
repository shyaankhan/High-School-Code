//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
/**
 * @author Shyaan
 *
 */
import java.util.Arrays;

public class TestHayStack {
	
	public static void main(String [] args) throws Exception{
		
		
		
		String [] arrHayStack ={"hay","needle","hay","hay","hay"};
		
		
		int number = HayStack.findNeedle(arrHayStack);
		System.out.println("Needle is in arrHayStack["+number+"]");
		System.out.println(Arrays.toString(arrHayStack));

		String [] newArrHayStack = HayStack.modifyHayStack(arrHayStack);
		System.out.println(Arrays.toString(newArrHayStack));
		
		}
	
}


