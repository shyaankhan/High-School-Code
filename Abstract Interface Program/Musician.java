//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class Musician implements Practice{
	
	private String name;
	private String instrument;
	
	
	public Musician(String name, String instrument)
	{
		this.name = name;
		this.instrument = instrument;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getInstrument()
	{
		return instrument;
	}
	
	
	public String practice()
	{
		return getName()+" has practiced playing the "+getInstrument();
	}

}
