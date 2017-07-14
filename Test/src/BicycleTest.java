
public final class BicycleTest {
	
	public static void main(String[] args)
	{
		Bicycle bike1 = new Bicycle(3, 4, 5);
		
		Bicycle bike2 = new Bicycle(6, 7, 8);
		
		//can invoke with the object , but it is really a Class variable
		//an object should not be required to access static data(bike1.getNumberofBicycles())
		//invoke STATIC methods with Class Names 
		System.out.println(Bicycle.getNumberOfBicycles());
		
		
	}
}
