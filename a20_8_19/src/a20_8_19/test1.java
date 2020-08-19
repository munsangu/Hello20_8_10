package a20_8_19;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class test1 extends Applet 
{
	public void paint(Graphics g) 
	{
		Color c = new Color(255,0,0); //0~255(256°³)R,G,B
		Font f = new Font("±Ã¼­Ã¼",Font.BOLD,30);
		g.setFont(f);
		g.setColor(c);
		g.drawString("KOREA",100, 100);
		Color c2 = Color.blue;
		Font f2 = new Font("µ¸¿òÃ¼",Font.BOLD,30);
		g.setFont(f2);
		g.setColor(c2);
		g.drawString("Practice Of Applet",100, 200);
	}
	public void destroy() 
	{
		System.out.println("²¨Áü");
	}
	public void init() 
	{
		System.out.println("ÃÊ±â");
	}
	public void start() 
	{
		System.out.println("½ºÅ¸Æ®");
	}
	public void stop() 
	{
		System.out.println("½ºÅ¾");
	}

}
