package a20_8_11;
import javax.swing.JFrame;

public class testFrame 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setTitle("프레임연습");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 300, 300);
	}
}
