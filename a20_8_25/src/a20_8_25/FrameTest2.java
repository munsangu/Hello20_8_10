package a20_8_25;

import javax.swing.JFrame;

public class FrameTest2 
{
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setTitle("Great!");
		jf.setBounds(10, 20, 500, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
