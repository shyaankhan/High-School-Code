//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class Lunch {
	private String dish, drink;
	private boolean isYummy;
	
	public Lunch(String dish, String drink, boolean isYummy)
	{
		this.dish= dish;
		this.drink = drink;
		this.isYummy = false;
	}
	
	public String getDish()
	{
		return dish;
	}
	
	public String getDrink()
	{
		return drink;
	}
	
	public boolean getIsYummy()
	{
		return isYummy;
	}
	
	public void setDish(String newDish)
	{
		dish = newDish;
	}
	
	public void setDrink(String newDrink)
	{
		drink = newDrink;
	}
	
	public void setIsYummy(boolean newIsYummy)
	{
		newIsYummy = true;
		isYummy = newIsYummy;
	}

	public String toString()
	{
		return dish+" and "+drink+" is yummy? "+isYummy;
	}
	
}
