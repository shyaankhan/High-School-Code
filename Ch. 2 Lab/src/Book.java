import java.util.*; 
public class Book
{
	Scanner in = new Scanner(System.in); 
	private String author, title, story; 
	private int numOfSentences, yearPublished; 
	private String fictionOrNon;
	public static int numOfBooks = 3;		//static variable
	public Book ()
	{
		author = null; 
		title = null; 
		story = ""; 
		numOfSentences = 0;
		yearPublished = 0;
	}
	public Book (String authorInit, String titleInit, int numOfSentencesInit, int yearPublishedInit)
	{
		author = authorInit; 
		title = titleInit; 
		story = "";
		numOfSentences = numOfSentencesInit; 
		yearPublished = yearPublishedInit;
	
	}
	
	public Book(String authorInit, String titleInit)    //overloaded method
	{
		author = authorInit;
		title = titleInit;
		
	}
	
	public void swapAuthorName(Book b1, Book b2)		//method with formal parameters, class types
	{
		String auth1 = b1.getAuthor();
		String auth2 = b2.getAuthor();
		
		b1.setAuthor(auth2);
		b2.setAuthor(auth1);
		
	}
	public void setAuthor (String newAuthor)
	{
		author = newAuthor;
	}
	public void setTitle (String newTitle)
	{
		title = newTitle;
	}
	public void setNumOfSentences (int newNumOfSentences)
	{
		numOfSentences = newNumOfSentences;
	}
	public void setYearPublished (int newYearPublished)
	{
		yearPublished = newYearPublished;
	}
	public String getAuthor ()
	{
		return author;
	}
	public String getTitle ()
	{
		return title;
	}
	public int getNumOfSentences ()
	{
		return numOfSentences;
	}
	public int getYearPublished ()
	{
		return yearPublished;
	}
	public void writeBook ()
	{
		for (int i = 0; i < numOfSentences; i++)
	{
			System.out.print ("Enter a sentence for your book: "); story += " " + in.nextLine();
	}
	System.out.println ("Story finished!");
	}
	public void readStory ()
	{
		System.out.println (story);
	}
	public int findLength ()
	{
		return story.length ();
	}
	public void publish ()
	{
		System.out.println ("--------" + title + "--------\nAuthor: " + author + "\n" + story + "\n~");
	}
	public void burn ()
	{
		System.out.println ("This isn't WWII! Burning declined. Return NEIN NEIN NEIN");
	}
	public void clear ()
	{
		story = "";
	}
	public String toString ()
	{
	return "Author: " + author + "\tTitle: " + title + "\tNumber of Sentences: " + numOfSentences + "\tYearPublished: " + yearPublished;
	}
	}
	 
	 