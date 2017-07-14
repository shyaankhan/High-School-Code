//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class PointGuard extends Player implements Practice{
	

	private double assistsPerGame;
	
	public PointGuard(String name, int number ,String team, double assistsPerGame)
	{
		super(name, number, team);
		this.assistsPerGame = assistsPerGame;	
	}
	
	public double getAssistsPerGame()
	{
		return assistsPerGame;
	}

	
	public String pass(Player a) 
	{
		String nameNewPlayer = a.getName();
		return "The ball has been passed to "+nameNewPlayer;
	}

	public String rebound(Player a) 
	{
		String nameNewPlayer = a.getName();
		return a.getName()+" has got the rebound.";
		
	}
	
	public String block(Player a)
	{
		String nameNewPlayer = a.getName();
		return a.getName()+" has been blocked.";
		
	}
	
	public String practice()
	{
		return getName()+" has practiced dribbling and 3 point shooting";
	}	
}
