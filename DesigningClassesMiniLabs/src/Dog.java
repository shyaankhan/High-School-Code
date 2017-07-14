//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class Dog {
	private String name;
	private int age;
	public Dog(String nameIn, int ageIn)
	{
		name = nameIn;
		age = ageIn;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String nameNew)
	{
		name = nameNew;
	}
	public void setAge(int ageNew)
	{
		age = ageNew;
	}
	public void computeAgeInPersonYrs(int ageInPersonYrs)
	{
		ageInPersonYrs = 7*age;
		age = ageInPersonYrs;
	}
	public String toString()
	{
		return "Name: "+name+"\nAge: "+age;
	}
}
