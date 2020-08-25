package a20_8_25;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class mouseTest extends Applet implements MouseListener 
{

	JLabel lbl1;
	int num;			// Counting
	int x[], y[];       // X축, Y축을 저장하기 위한 x,y 배열
	public void init() 
	{
		this.setLayout(null);
		lbl1 = new JLabel("Draw the Circle by the mouse");
		lbl1.setBounds(10, 20, 200, 10);
		this.add(lbl1);
		num=0;
		x = new int[100];
		y = new int[100];
		this.addMouseListener(this);
	}
	
	
	public void paint(Graphics g) 
	{
		g.setColor(Color.BLUE);
		for(int i=0;i<num;i++) 
		{
		g.fillOval(x[i]-10, y[i]-10, 20, 20);
		}
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		System.out.println("You maybe Click the Mouse");
		System.out.println("X축 = "+e.getX());
		System.out.println("Y축 = "+e.getY());
		if(num<100) 
		{
			x[num]=e.getX();
			y[num]=e.getY();
			num++;
		}
		repaint();
	}
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}	
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}

}
