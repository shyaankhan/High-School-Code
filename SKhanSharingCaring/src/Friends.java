//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class Friends {

	private String name;
	private Homework homework1;
	private Lunch lunch1;
	
	public Friends(String name, Homework homework1, Lunch lunch1)
	{
		this.name = name;
		this.homework1 = homework1;
		this.lunch1 = lunch1;
	}
	public String getName()
	{
		return name;
	}
	public Homework getHomework()
	{
		return homework1;
	}
	public Lunch getLunch()
	{
		return lunch1;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setHomework(Homework newHomework)
	{
		homework1 = newHomework;
	}
	public void setLunch(Lunch newLunch)
	{
		lunch1 = newLunch;
	}
	
	public String toString()
	{
		return "Name: "+name+"\n"+homework1+"\n"+lunch1;
	}
	
}
