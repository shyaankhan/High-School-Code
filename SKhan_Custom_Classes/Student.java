//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 10/28/14	
// Description:  Create a code of 2 classes
//-----------------------------------------------------------

public class Student {
	private String name;
	private int birthYear;
	private int age;
	private String gender;
	public Student()
	{
		name = null;
		birthYear = 0;
		gender = null;
	}
	public Student(String nameIn, int birthYearIn, String genderIn)
	{
		name = nameIn;
		birthYear = birthYearIn;
		gender = genderIn;
	}
	public void setName(String newName)
	{
		name = newName;
	}	
	public void setBirthYear(int newYear)
	{
		birthYear = newYear;
	}
	public void setAge(int newAge)
	
	{
		age = newAge;
	}
	public void setGender(String newGender)
	{
		gender = newGender;
	}
	public String getName()
	{
		return name;
	}
	public int getBirthYear()
	{
		return birthYear;
	}
	public int computeAge()
	{
		int currentYear = 2014;
		int age = currentYear - birthYear;
		return age;
	}
	public int getAge()
	{return age;
	}
	public String getGender()
	{return gender;
	}
	public String toString()
	{return "Name: "+name+"\nAge: "+computeAge()+"\nGender: "+gender;
	}
}
