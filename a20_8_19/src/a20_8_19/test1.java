package a20_8_19;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class test1 extends Applet 
{
	public void paint(Graphics g) 
	{
		Color c = new Color(255,0,0); //0~255(256��)R,G,B
		Font f = new Font("�ü�ü",Font.BOLD,30);
		g.setFont(f);
		g.setColor(c);
		g.drawString("KOREA",100, 100);
		Color c2 = Color.blue;
		Font f2 = new Font("����ü",Font.BOLD,30);
		g.setFont(f2);
		g.setColor(c2);
		g.drawString("Practice Of Applet",100, 200);
	}
	public void destroy() 
	{
		System.out.println("����");
	}
	public void init() 
	{
		System.out.println("�ʱ�");
	}
	public void start() 
	{
		System.out.println("��ŸƮ");
	}
	public void stop() 
	{
		System.out.println("��ž");
	}

}
