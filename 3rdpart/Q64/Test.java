import java.awt.*;
import java.applet.Applet;
public class Test extends Applet
{
	public void paint(Graphics g)
	{
		//g.drawString("Hello Everyone",40,90); //40 denotes x and 90 for y
		// g.drawLine(100,200,300,400); //for drawing line
		// g.drawLine(200,10,400,10);
		//g.drawRect(100,90,100,200);//for rectangle
		//g.drawRect(100,90,200,200); //square
		//g.drawOval(100,90,200,200);//for circle
		// g.drawOval(100,90,100,200); //for oval
		// g.fillOval(100,90,100,200);//to fill color by defaut black
		// g.drawOval(100,90,100,200);//If we mwntion it above the boder
		//                             //will be black.
		// g.setColor(Color.RED);
		// //If we mention it here the boder will be red.
		// g.fillOval(100,90,100,200);
		Color ob = new Color(80,70,100);
		g.setColor(ob);
		g.drawOval(100,90,100,200);
		g.fillOval(100,90,100,200);//to fill color by defaut black
		

	}
}