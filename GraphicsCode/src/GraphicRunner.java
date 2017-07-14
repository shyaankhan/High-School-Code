
import javax.swing.JFrame;

public class GraphicRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new ColoredBoxes());					
						
		//getContentPane().add(new RandomColoredBoxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicRunner run = new GraphicRunner();
	}
}