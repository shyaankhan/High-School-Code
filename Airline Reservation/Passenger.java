//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author Shyaan
 *
 */
public class Passenger {
	private String name;
	private int row;
	private int seat;

	public Passenger(String name, int row, int seat)
	{
		this.name = name;
		this.row = row;
		this.seat = seat;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getSeat()
	{
		return seat;
	}
	
}
