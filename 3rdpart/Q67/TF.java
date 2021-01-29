import java.awt.*;
import javax.swing.*;
public class TF extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		JTextField jft = new JTextField(6);
		cp.add(jft);
	}
}