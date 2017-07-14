public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
        
    private int id;
    
    private static int numberOfBicycles = 0;

        
    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfBicycles() {
    	int a = startSpeed;  //CANNOT access instance variables or methods inside a static method static is NOT an instance, not associated with any particular object
        getCadence();
        this.startSpeed = 3; //cannot use this inside a static method, there is NO this- the method is not an instance method, not invoked by an object, IT is a class method to be invoked with a class Name
    	return numberOfBicycles;
        
    }

    public int getCadence(){
    	getNumberOfBicycles();  //CAN Access static data(variable, method) within an instance method
        return cadence;
    }
        
    public void setCadence(int newValue){
        cadence = newValue;
    }
        
    public int getGear(){
    return gear;
    }
        
    public void setGear(int newValue){
        gear = newValue;
    }
        
    public int getSpeed(){
        return speed;
    }
        
    public void applyBrake(int decrement){
        speed -= decrement;
    }
        
    public void speedUp(int increment){
        speed += increment;
    }
}
/*
Static variable initialization

Static variables are initialized when class is loaded.
Static variables in a class are initialized before any object of that class can be created.
Static variables in a class are initialized before any static method of the class runs.
Default values for declared and uninitialized static and non-static variables are same

Static variables will utilize memory since they are SHARED by all objects
*/