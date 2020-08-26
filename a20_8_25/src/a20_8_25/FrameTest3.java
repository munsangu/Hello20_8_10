package a20_8_25;
import javax.swing.JFrame;

class chJFrame extends JFrame
	{
		public chJFrame() 
		{
			this.setVisible(true);
			this.setLocation(10, 10);
			this.setSize(300,300);
			this.setTitle("Great Java");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

public class FrameTest3 
{
	public static void main(String[] args) 
	{
		chJFrame chj = new chJFrame();
	}
}
