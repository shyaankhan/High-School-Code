//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class Circle {
	private int radius;
	private double area;
	public Circle()
	{
		radius = 1;
	}
	public void setRadius (int radiusNew)
	{
		radius = radiusNew;
	}
	public int getRadius()
	{
		return radius;
	}
	public void computeArea()
	{
		area = (radius*radius*3.14);
	}
	public double getArea()
	{
		return area;
	}
	public String toString()
	{
		return "Radius: "+radius+"\nArea: "+area;
	}
	
	

}
