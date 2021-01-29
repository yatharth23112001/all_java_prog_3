import java.awt.*;
import javax.swing.*;
public class Label extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		JLabel jl=new JLabel("Ayan",JLabel.CENTER);
		cp.add(jl);
	}
}