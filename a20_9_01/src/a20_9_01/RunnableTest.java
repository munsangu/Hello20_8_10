package a20_9_01;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

public class RunnableTest extends Applet implements Runnable
{
	Font font;			//  �۲�
	Thread kim=null;
	public void run() 
	{
			int num=0;
			while(true) 
			{
				try 
				{
					kim.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				repaint();						// paint() �޼ҵ� ȣ��
			}
	}
	public void init() 
	{
		font = new Font("�ü�ü",Font.BOLD,40);
		this.setBackground(Color.BLUE);
	}
	public void start() 
	{
		if(kim==null) 
		{
			kim = new Thread(this);
			kim.start();						// run()ȣ��
		}
	}
	public void paint(Graphics g) 
	{
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
//		System.out.println(c);
		String str = year+"�� "+month+"�� "+date+"�� "+hour+"�� "+min+"�� "+sec+"��";
		g.setFont(font);
		g.drawString(str, 10, 40);
	}
	public void stop() 
	{
		if((kim==null)&&(kim.isAlive())) 
		{
			kim=null;
		}
	}
}
