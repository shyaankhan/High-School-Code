//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	11/11/14
// Description: Version 1 of the Holiday Applet
//-----------------------------------------------------------


	import javax.swing.JApplet;
import javax.swing.JFrame;

import java.awt.*;

	public class ChristamsV1 extends JApplet
	{
	
	   public void paint (Graphics page)
	   {
	      final int MID = 150;
	      final int TOP = 50;
	      final int TREE = 30;

	      this.setSize(800, 600);
	      
	    setBackground (Color.DARK_GRAY);

	    page.setColor(Color.DARK_GRAY);
	    page.fillRect(0,0, 1000, 1000);  
	    
	      // page.setColor (Color.blue);
	     // page.fillRect (0, 175, 300, 50);  // ground
	      
	      page.setColor (Color.white);
	      page.fillOval (MID-20, TOP, 40, 40);      // head
	      page.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
	      page.fillOval (MID-50, TOP+80, 100, 60);  // lower torso

	      page.setColor(Color.black);
	      page.drawOval(MID-20, TOP, 40, 40);
	      
	      page.setColor (Color.black);
	      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
	      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

	      page.drawArc (MID-10, TOP+20, 20, 10, 190, 160);   // smile

	      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
	      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

	      //page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of OLD BLACK hat
	      //page.fillRect (MID-15, TOP-20, 30, 25);        // top of OLD BLACK hat
	      
	      int xpoints[] = {MID+232, MID+292, MID+162};
	      int ypoints[] = {TREE-23, TREE+95,TREE+95}; 
	      page.setColor(Color.green);
	      page.fillPolygon(xpoints, ypoints, 3); 				//green tree
	      
	   
	      page.fillRect(MID+40, TOP-100, 60, 50);
	      
	      int xpoints2[] = {MID+185, MID+165, MID+165};
	      int ypoints2[] = {TREE+80, TREE+90, TREE+80}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints2, ypoints2, 3);
	      
	      int xpoints3[] = {MID+194, MID+174, MID+174};
	      int ypoints3[] = {TREE+66, TREE+76, TREE+66}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints3, ypoints3, 3);
	      
	      int xpoints4[] = {MID+203, MID+183, MID+183};
	      int ypoints4[] = {TREE+52, TREE+62, TREE+52}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints4, ypoints4, 3);
	      
	      int xpoints5[] = {MID+210, MID+192, MID+192};
	      int ypoints5[] = {TREE+37, TREE+47, TREE+37}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints5, ypoints5, 3);
	      
	      int xpoints6[] = {MID+215, MID+197, MID+197};
	      int ypoints6[] = {TREE+25, TREE+35, TREE+25}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints6, ypoints6, 3);
	      
	      int xpoints7[] = {MID+219, MID+201, MID+201};
	      int ypoints7[] = {TREE+13, TREE+23, TREE+13}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints7, ypoints7, 3);
	     
	      int xpoints8[] = {MID+223, MID+205, MID+205};
	      int ypoints8[] = {TREE+4, TREE+14, TREE+4}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints8, ypoints8, 3);
	      
	      int xpoints9[] = {MID+228, MID+208, MID+208};
	      int ypoints9[] = {TREE-5, TREE+5, TREE-5}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints9, ypoints9, 3);
	      
	      int xpoints10[] = {MID+270, MID+290, MID+290};		//MID+85 , MID+125, MID+125
	      int ypoints10[] = {TREE+80, TREE+90, TREE+80}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints10, ypoints10, 3);
	      
	      int xpoints11[] = {MID+265, MID+285, MID+285};	//-14
	      int ypoints11[] = {TREE+66, TREE+76, TREE+66}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints11, ypoints11, 3);
	      
	      int xpoints12[] = {MID+260, MID+280, MID+280};
	      int ypoints12[] = {TREE+52, TREE+62, TREE+52}; //-28
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints12, ypoints12, 3);
	      
	      int xpoints13[] = {MID+253, MID+275, MID+275};
	      int ypoints13[] = {TREE+37, TREE+47, TREE+37}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints13, ypoints13, 3);
	      
	      int xpoints14[] = {MID+247, MID+269, MID+269};		//-53
	      int ypoints14[] = {TREE+25, TREE+35, TREE+25}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints14, ypoints14, 3);
	      
	      int xpoints15[] = {MID+242, MID+264, MID+264};	
	      int ypoints15[] = {TREE+13, TREE+23, TREE+13}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints15, ypoints15, 3);
	     
	      int xpoints16[] = {MID+240, MID+262, MID+262};
	      int ypoints16[] = {TREE+4, TREE+14, TREE+4}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints16, ypoints16, 3);
	      
	     int xpoints17[] = {MID+236, MID+258, MID+258};
	     int ypoints17[] = {TREE-5, TREE+5, TREE-5}; 
	      page.setColor(Color.DARK_GRAY);
	      page.fillPolygon(xpoints17, ypoints17, 3);
	      
	      Color brown = new Color(156, 93, 82);					//tree trunk
	      page.setColor(brown);
	      page.fillRect(360, 125, 40, 50);
	      
	      int xpoints18[] = {MID+0, MID+20, MID-20};			//red santa hat
	      int ypoints18[] = {TREE-13, TREE+25,TREE+25}; 
	      page.setColor(Color.red);
	      page.fillPolygon(xpoints18, ypoints18, 3);
	      
	      page.setColor(Color.white);
	      page.fillOval (MID-6, TOP-37, 10, 10);     			 // white fluff on top of hat
	      
	      page.setColor(Color.white);							//white stripe on bottom of hat
	      page.fillRect(131, 47, 39, 8);
	      
	      page.setColor(Color.cyan);							//present1
	      page.fillRect(320, 150, 30, 30);
	      page.setColor(Color.white);						
	      page.fillRect(332, 150, 8, 30);
	      page.setColor(Color.white);						
	      page.fillRect(320, 160, 30, 8);
	      
	      page.setColor(Color.red);							//present2
	      page.fillRect(415, 150, 30, 30);
	      page.setColor(Color.white);						
	      page.fillRect(426, 150, 8, 30);
	      page.setColor(Color.white);						
	      page.fillRect(415, 160, 30, 8);
	      
	      
	    
	      
	   }
	}

