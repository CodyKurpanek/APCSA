package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private SnowMan sMan;
	private tree t, r, e, E;

	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		//populate the list with 50 unique snowflakes
		for (int i = 0; i < 50; i ++) {
			int tmp = (int)(Math.random() * 800);
			int tmp2 = (int)(Math.random() * 800);
			shapes.add(new FancySnowFlake(tmp, tmp2));
		}
		//instantiate a snowman
		sMan = new SnowMan(400, 420, 220, 200);
		t = new tree(50, 540, 220, 400);
		r = new tree(150, 540, 250, 270);
		e = new tree(250, 540, 200, 220);
		E = new tree(580, 540, 250, 260);
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("SNOWY WINTER SCENE!",40,40);

		//make the snowman appear
		
		window.fillOval(sMan.getDimensions()[0], sMan.getDimensions()[1],
				sMan.getDimensions()[2], sMan.getDimensions()[3]);
		window.fillOval(sMan.getDimensions()[4], sMan.getDimensions()[5],
				sMan.getDimensions()[6], sMan.getDimensions()[7]);
		/*
		window.fillRect(t.getDimensions()[0], t.getDimensions()[1],
				t.getDimensions()[2], t.getDimensions()[3]);
		window.fillRect(t.getDimensions()[4], t.getDimensions()[5],
				t.getDimensions()[6], t.getDimensions()[7]);
*/
		window.setColor(Color.GREEN);
		window.fillPolygon(t.a, t.b, t.c);
		window.fillPolygon(t.d, t.e, t.f);
		
		window.fillPolygon(r.a, r.b, r.c);
		window.fillPolygon(r.d, r.e, r.f);
		
		window.fillPolygon(e.a, e.b, e.c);
		window.fillPolygon(e.d, e.e, e.f);
		
		window.fillPolygon(E.a, E.b, E.c);
		window.fillPolygon(E.d, E.e, E.f);

		
		//make the snowflakes appear and move down the screen
		
		for (AbstractShape s: shapes) {
			window.setColor(Color.WHITE);
			int[] a = {s.getXPos(), s.getXPos() + 10, s.getXPos() + 20, s.getXPos() + 20,s.getXPos() + 10};
			int[] b = {s.getYPos() + 10, s.getYPos() + 20, s.getYPos() + 15,s.getYPos()  + 5, s.getYPos(), s.getYPos() + 5};
			window.fillPolygon(a, b, 5);
			s.setYPos(s.getYPos() + s.getYSpeed());
			//check to see if any of the snowflakes need to be reset to the top of the screen
			if (s.getYPos() > 800) {
				s.setYPos(0);
			}
		}
		
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}