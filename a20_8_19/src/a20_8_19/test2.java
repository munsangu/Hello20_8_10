package a20_8_19;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class test2 extends Applet 
{
	public void paint(Graphics g) 
	{
		g.setColor(Color.BLUE);
		g.drawLine(50, 100, 150, 100);// 좌표(가로지점,세로지점,가로지점,세로지점), 선
		g.drawRect(250, 100, 100, 100); // 좌표(가로지점,세로지점,너비,높이), 사각형
		g.fillRect(250, 300, 100, 100); // 좌표(가로지점,세로지점,너비,높이), 색깔이 채워진 사각형
		g.drawOval(450, 100, 100, 100); // 좌표(가로지점, 세로지점, 너비, 높이), 원
		
		int x[]	= {650,600,800};
		int y[] = {100,200,200}; //(가로, 세로) =  (650, 100), (600,200), (800,200) 지점
		
		g.drawPolygon(x,y,3);
	}
}
