//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 11/7/14	
// Description: Make a program which can create a zero dimensional object, a line, a rectangle, or a box
//-----------------------------------------------------------

public class BoxConstructor {
	private int length, width, height;
	private String output;
	
	public BoxConstructor()
	{
		length = 0;
		width = 0;
		height = 0;
		output = "Nothing Created";
	}
	
	public BoxConstructor(int lengthIn)
	{
		this(lengthIn, 0, 0);
		output = "Line created";
	}
	public BoxConstructor(int lengthIn, int widthIn)
	{
		this(lengthIn, widthIn, 0);
		output = "Rectangle Created";
	}
	
	public BoxConstructor(int lengthIn, int widthIn, int heightIn)
	{
		length = lengthIn;
		width = widthIn;
		height = heightIn;
		output = "Box Created";
	}
	

	
	public String toString()
	{
		return output;
	}
	
}
