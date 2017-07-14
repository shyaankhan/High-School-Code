//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
public class Backpacks { 
private String phone; 
private String homework; 
private double zipped; 
private static int numItems; 							//static variable
public Backpacks(String phone, String homework, double zipped, int numItems) 
{ 
	super(); 
	 this.phone = phone; 
	 this.homework = homework; 
	 this.zipped = zipped; 
	 this.numItems = numItems; 
 } 
 public Backpacks(String homework, int numItems)			//overloaded method
 {	
	 this.homework =  homework;
	 this.numItems = numItems;
 }
 @Override 
 public String toString() { 
	 return getZipped() + "You have "+ numItems + " items\n" + 
	 getNumItems() + "\n" + getHomework() + getPhone(); 
 } 
 
	 public static int getNumofItems()					//static method
	 {
		 return numItems+Book.numOfBooks;
	 }
	 
	 public Book returnBookClass()				//returns object reference
	 {
	 Book book = new Book();
	 return book;
	 }
	 
 public String getPhone() { 
	 if (phone.equals("Out")) 
	 { 
	 System.out.println("Put your phone away!"); 
	 } 
	 else 
	 { 
	 System.out.println("You are a responsible student!"); 
	 } 
	 return ""; 
	 } 
 
	 public void setPhone(String phone) { 
	this.phone = phone; 
 } 
 public String getHomework() { 
	 String homework = ""; 
 if (homework.equals("Out")) 
	 { 
	 homework = "Take your homework out."; 
	 } 
else 
	 { 
	 homework = "Your homework better be finished..."; 
	 } 
	 return homework; 
	 } 
 public void setHomework(String homework) { 
	 this.homework = homework; 
	 } 
	 public String getZipped() { 
	 while (zipped < 1.0) 
	 { 
	 System.out.println("Zip"); 
	 zipped = zipped + .25; 
	 } 
	 { 
	 return ""; 
	 } 
	 } 
 public void setZipped(double zipped) { 
	 this.zipped = zipped; 
 	} 
 public String getNumItems() { 
	 String books = ""; 
	 if (numItems > 10) 
	 { 
	 books = "Put your books in a locker!"; 
	 } 
	 else 
	 { 
	 books = "Your backpack has everything it needs."; 
	 } 
	 return books; 
	 } 
 public void setNumItems(int numItems) { 
	 this.numItems = numItems; 
 	}
 }