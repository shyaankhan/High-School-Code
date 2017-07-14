//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class Worker {
	
	public String name;
	public int rate;
	
	public Worker(String newName, int newRate)
	{
		name = newName;
		rate = newRate;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setRate(int newRate)
	{
		rate = newRate;
	}
	
	
	public int computePay(int hours)
	{
		if(hours > 40)
		{
			int excess = hours - 40;
			int excessPay = excess/2;
			int pay = hours*rate;
			return pay;
		}
		
	}
	

}
