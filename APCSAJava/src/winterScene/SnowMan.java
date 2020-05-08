package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{

   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
		
		setDimensions (new int[] {getXPos(), getYPos() - (int)(getHeight() * 0.4), (int)(getWidth() * 0.4),
				(int)(getHeight() * 0.4), getXPos() - (int)(getWidth() * 0.12), getYPos(),
				(int)(getWidth() * 0.6), (int)(getHeight() * 0.6)});
		
		
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 	      	
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
   

}