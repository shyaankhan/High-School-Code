
/**
This class keeps track of a frog
*/
public class Frog
{
private int weight;
private int age;
private String name;
/**
postcondition: Creates a frog that weighs 2 pounds, 0 years old,
and has the name "Noname".
*/
public Frog()
{
this(2, "Noname");
}
/**
@param theWeight the weight of the frog to create.
@param theName the name of the frog to create.
postcondition: Creates a frog that weighs theWeight pounds, 0 years old,
and has the name theName.
*/
public Frog(int theWeight, String theName)
{
weight = theWeight;
age = 0;
name = theName;
}
/**
Returns the weight of the frog.
@return returns the weight of the frog.
*/
public int getWeight()
{
return weight;
}
/**
Returns the age of the frog.
@return returns the age of the frog.
*/
public int getAge()
{
return age;
}
/**
Returns the name of the frog.
@return returns the name of the frog.
*/
public String getName()
{
return name;
}
/**
The frog ages one year.
postcondition: the age of the frog is increment by one
*/
public void birthday()
{
age++;
}
/**
Changes the weight of the frog.
precondition: newWeight must be positive.
@param newWeight the new weight of the frog.
postcondition: the weight of the frog is changed to newWeight.
*/
public void changeWeight(int newWeight)
{
weight = newWeight;
}
/**
@return returns the name, age and weight of the frog in a string.
*/
public String toString()
{
return name + " " + age + " " + weight;
}
}