//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description: The super class is Player, and the subclasses are PointGuard and Center,
// which are both positions of a basketball Player. The interface is Practice, which 
// both a Player can do and a Musician can do.
//-----------------------------------------------------------

public abstract class Player {
	
	private int number;
	private String name;
	private String team;
	public Player(String name, int number, String team)
	{
		this.name = name;
		this.number = number;
		this.team = team;
	}
	
	public String getName()
	{
		return name;
	}

	public int getNumber()
	{
		return number;
	}
	
	public String getTeam()
	{
		return team;
	}
	
	public abstract String pass(Player a);
	public abstract String rebound(Player a);
	public abstract String block(Player a);
	
}
