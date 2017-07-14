//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class Car {
	private String make, model;
	private int year;
	public Car(String makeOfIt, String modelOfIt, int yearOfIt)
	{
		make = makeOfIt;
		model = modelOfIt;
		year = yearOfIt;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	public void setMake(String makeUpdate)
	{
		make = makeUpdate;
	}
	public void setModel(String modelUpdate)
	{
		model = modelUpdate;
	}
	public void setYear(int yearUpdate)
	{
		year = yearUpdate;
	}
	public String toString ()
	{
		return "Make: "+ make +"\nModel: "+model+"\nYear: "+year;
	}
}
