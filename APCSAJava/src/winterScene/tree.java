package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class tree extends AbstractShape
{
	public int[] a, b, d, e;
	public int c, f;
	

   public tree(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.GREEN, 0, 0);
		
		setDimensions (new int[] {getXPos(),
				getYPos() - (int)(getHeight() * 0.4),
				(int)(getWidth() * 0.4),
				(int)(getHeight() * 0.4),
				
				getXPos() - (int)(getWidth() * 0.12),
				getYPos(),
				(int)(getWidth() * 0.6),
				(int)(getHeight() * 0.6)});
		
		a = new int[]{ getXPos() + ((int)(getWidth() * 0.4)) / 2,
				getXPos() + ((int)(getWidth() * 0.4)),
				getXPos()};
		b = new int[] {getYPos() - (int)(getHeight() * 0.4) - (int)(getHeight() * 0.4),
				getYPos() - (int)(getHeight() * 0.4),
				getYPos() - (int)(getHeight() * 0.4)};
		c = 3;
		d = new int[] {getXPos() - (int)(getWidth() * 0.12) + ((int)(getWidth() * 0.6))/2,
				getXPos() - (int)(getWidth() * 0.12) + (int)(getWidth() * 0.6),
				getXPos() - (int)(getWidth() * 0.12)};
		
		e = new int[] {getYPos() - (int)(getHeight() * 0.4) + (int)(getHeight() * 0.4) - (int)(getHeight() * 0.4),
				getYPos() - (int)(getHeight() * 0.4) + (int)(getHeight() * 0.4),
				getYPos() - (int)(getHeight() * 0.4) + (int)(getHeight() * 0.4)};
		f = 3;
		
		
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