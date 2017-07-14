//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class Center extends Player implements Practice{
	
	private double reboundsPerGame;
	
	public Center(String name, int number, String team, double reboundsPerGame){
		super(name, number, team);
		this.reboundsPerGame = reboundsPerGame;
	}
	
	public double getReboundsPerGame()
	{
		return reboundsPerGame;
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
		return getName()+" has practiced his post moves";
	}
}
	
