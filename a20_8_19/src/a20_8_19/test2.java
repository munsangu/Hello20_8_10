package a20_8_19;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class test2 extends Applet 
{
	public void paint(Graphics g) 
	{
		g.setColor(Color.BLUE);
		g.drawLine(50, 100, 150, 100);// ��ǥ(��������,��������,��������,��������), ��
		g.drawRect(250, 100, 100, 100); // ��ǥ(��������,��������,�ʺ�,����), �簢��
		g.fillRect(250, 300, 100, 100); // ��ǥ(��������,��������,�ʺ�,����), ������ ä���� �簢��
		g.drawOval(450, 100, 100, 100); // ��ǥ(��������, ��������, �ʺ�, ����), ��
		
		int x[]	= {650,600,800};
		int y[] = {100,200,200}; //(����, ����) =  (650, 100), (600,200), (800,200) ����
		
		g.drawPolygon(x,y,3);
	}
}
