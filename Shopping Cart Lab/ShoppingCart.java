//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
import java.util.ArrayList;

public class ShoppingCart {
	private int count;
	private int totalCost;
	private ArrayList itemList;
		
	public ShoppingCart()
	{
		itemList = new ArrayList(); 
		count = 0;
		totalCost = 0;
	}
	
	public void addItem(item item1)
	{
		itemList.add(item1);		
	}
	
	public String toString()
	{
		String totals = "";
		for(int i = 0; i < itemList.size(); i++)
		{
			totals += (itemList.get(i) + "\n");
		}
		return totals;
	}
	
	public int searchForItem(int id)
	{
		int i =0;
		int size = itemList.size();
		for(int index = 0; index<size; index++)
		{
			item item1 = (item)itemList.get(index);
			if(item1.getID() == id) 
			{
				i = index;
			}
		}
		return i;
	}
	
	public void removeItem(int id1)
	{
		int index = searchForItem(id1);
		itemList.remove(index);
	}
	
	public double getTotalCost()
	{
		for(int i = 0; i < itemList.size(); i++)
		{
			item item1 = (item) itemList.get(i);
			totalCost += item1.getCost();			
		}
		return totalCost;
	}
	
	
	
		
}
