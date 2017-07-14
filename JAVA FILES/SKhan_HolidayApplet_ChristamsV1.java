//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	11/11/14
// Description: Version 1 of the Holiday Applet
//-----------------------------------------------------------


	import javax.swing.JApplet;
	import java.awt.*;

	public class ChristamsV1 extends JApplet
	{
	
	   public void paint (Graphics page)
	   {
	      final int MID = 150;
	      final int TOP = 50;
	      final int TREE = 30;

	      this.setSize(800, 600);
	      
	      setBackground (Color.green);

	      /*page.setColor (Color.blue);
	      page.fillRect (0, 175, 300, 50);  // ground
	      */
	      page.setColor (Color.black);
	      page.drawOval (MID-20, TOP, 40, 40);      // head
	      page.drawOval (MID-35, TOP+35, 70, 50);   // upper torso
	      page.drawOval (MID-50, TOP+80, 100, 60);  // lower torso

	      page.setColor (Color.black);
	      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
	      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

	      page.drawArc (MID-10, TOP+20, 20, 10, 190, 160);   // smile

	      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
	      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

	      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
	      page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat
	      
	      int xpoints[] = {MID+232, MID+292, MID+162};
	      int ypoints[] = {TREE-23, TREE+95,TREE+95}; 
	      page.setColor(Color.green);
	      page.fillPolygon(xpoints, ypoints, 3); 				//green tree
	      
	      int xpoints2[] = {MID+185, MID+165, MID+165};
	      int ypoints2[] = {TREE+80, TREE+90, TREE+80}; 
	      page.setColor(Color.white);
	      page.fillPolygon(xpoints2, ypoints2, 3);
	      
	      int xpoints3[] = {MID+194, MID+174, MID+174};
	      int ypoints3[] = {TREE+66, TREE+76, TREE+66}; 
	      page.setColor(Color.white);
	      page.fillPolygon(xpoints3, ypoints3, 3);
	      
	      
	   }
	}

