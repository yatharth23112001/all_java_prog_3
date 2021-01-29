import java.awt.*;
import java.applet.Applet;
public class Test extends Applet
{
	public void paint(Graphics g)
	{
		//g.drawString("Hello Everyone",40,90); //40 denotes x and 90 for y
		g.drawLine(100,200,300,400); //for drawing line
		g.drawLine(200,10,400,10);
	}
}