package a20_8_25;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class chFrame extends Frame implements WindowListener {

	public chFrame() 
	{
		this.setVisible(true);
		this.setTitle("Great Java");
		this.setBounds(10, 10, 300, 500);
		this.addWindowListener(this);
	}
	public void windowActivated(WindowEvent e) 
	{
		// TODO Auto-generated method stub	
	}
	public void windowClosed(WindowEvent e) 
	{
		// TODO Auto-generated method stub
	}
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) 
	{
		// TODO Auto-generated method stub	
	}
	public void windowDeiconified(WindowEvent e) 
	{
		// TODO Auto-generated method stub	
	}
	public void windowIconified(WindowEvent e) 
	{
		// TODO Auto-generated method stub		
	}
	public void windowOpened(WindowEvent e) 
	{
		// TODO Auto-generated method stub		
	}
}
