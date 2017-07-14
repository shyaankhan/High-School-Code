//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
/*
 * Use this template to write a program that
 * allows for comparison between people. First sorted by age, then lexicographical order.
 */

public  class Person implements Comparable<Object>{
  private String myName ;   // name of the person
  private int myAge;        // person's age
  private String myGender;  // "M" for male, "F" for female

  // constructor
  public Person(String name, int age, String gender){
    myName = name;
    myAge = age;
    myGender = gender;
  }
  
  public String getName(){
    return myName;
  }

  
	public int getAge(){
    return myAge;
  }

  public String getGender(){
    return myGender;
  }

  public void setName(String name){
    myName = name;
  }

  public void setAge(int age){
    myAge = age;
  }

  public void setGender(String gender){
    myGender = gender;
  }

  public String toString(){
     return myName + ", age: " + myAge + ", gender: " + 
			myGender;
  }
  
  
  public int compareTo(Object o) {
		
	Person p = (Person) o;
	int n = 0;
	
	if(getAge() < p.getAge())
	{
		n = -1;
	}
	else if(getAge() == p.getAge())
		{
			if(getName().compareTo(p.getName()) == -1)
			{
				n = -1;
			}
			
			if(getName().compareTo(p.getName()) == 0)
			{
				n=0;
			}
			if(getName().compareTo(p.getName()) == 1)
			{
				n=1;
			}
		}
		else if(getAge() > p.getAge())
		{
			n = 1;
		}
	return n;
}

}
