//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class item {
	
	private int id;
	private int qty;
	private double price; 
	private String name;
	
	public item(int id, int qty, double price, String name)
	{
		this.id = id;
		this.qty = qty;
		this.price = price;
		this.name = name;
		
	}	
	
	public String toString()
	{
		return "The ID Number is "+id+"\nThe quantity is "+qty+"\nThe price is "+price+"\nThe name is "+name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public double getCost()
	{
		return price*qty;
	}
	
	public void setQuantity (int qty1)
	{
		qty = qty1;
	}
	
	
	
	
	
}
