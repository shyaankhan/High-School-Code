
//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class WaterBottle {
	private String name;
	private boolean hasWaterBottle;
	private String color;
	private String brand;
	public WaterBottle(String nameIn, boolean hasWaterBottleIn, String colorIn, String brandIn)
	{
		name = nameIn;
		hasWaterBottle = hasWaterBottleIn;
		color = colorIn;
		brand = brandIn;
	}
	public WaterBottle(String nameIn, boolean hasWaterBottleIn)
	{
		name = nameIn;
		hasWaterBottle = hasWaterBottleIn;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setHasWaterBottle(Boolean newBottle)
	{
		hasWaterBottle = newBottle;
	}
	public void setColor(String newColor)
	{
		color = newColor;
	}
	public void setBrand(String newBrand)
	{
		brand = newBrand;
	}
	public String getName()
	{
		return name;
	}
	public boolean getHasWaterBottle()
	{
		return hasWaterBottle;
	}
	public String getColor()
	{return color;
	}
	public String getBrand()
	{return brand;
	}
	public String toString()
	{if (hasWaterBottle == true)
		{
		return "Name: "+name+"\nYou are thirsty"+"\nColor of Water Bottle: "+color+"\nBrand of Water Bottle: "+brand;
		}
		else
		{
				return "Name: "+name+"\nYou are not thirsty";
		}
	}
}

