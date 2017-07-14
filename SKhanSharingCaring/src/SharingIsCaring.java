//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author Shyaan
 *
 */
public class SharingIsCaring {
	 


	public void swapLunches(Friends f1, Friends f2)
	{
		
		
		Lunch lunch1 = f1.getLunch();
		lunch1.setIsYummy(true);
		
		Lunch lunch2 = f2.getLunch();
		lunch2.setIsYummy(true);
		
		Lunch oldLunch = f1.getLunch();
		
		lunch2.setDish(oldLunch.getDish());
		lunch2.setDrink(oldLunch.getDrink());
	
		lunch1.setDish(lunch2.getDish());
		lunch1.setDrink(lunch2.getDrink());
		
		
	
	}
	
	public void shareHomework(Homework homework1Completed, Homework homework2Completed)
	{
		String homework1,homework2;
		
		homework1 = homework1Completed.getAnswer1();
		homework2 = homework2Completed.getAnswer2();
		
		
			homework2Completed = homework1Completed;
		
	}
	
	
}
