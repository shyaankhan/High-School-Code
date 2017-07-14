//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author Shyaan
 *
 */
public class TestClass {
	public static void main(String [] args){
		
		Player steve = new PointGuard("Steve Nash", 10, "Lakers", 8.6);
		Player dwight = new Center("Dwight Howard", 12, "Rockets", 12.8);
		Musician beethoven = new Musician("Beethoven", "Piano");
		
		System.out.println(steve.pass(dwight));
		System.out.println(dwight.block(steve));
		System.out.println(beethoven.practice());
		
			
		PointGuard newSteve = (PointGuard)steve;
		double apg = newSteve.getAssistsPerGame();
		System.out.println(apg);
		
	}

}
