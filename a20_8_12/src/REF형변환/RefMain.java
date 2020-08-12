package REF형변환;
import javax.swing.JFrame;

public class RefMain 
{
	public static void call(Point temp) 
	{
		if(temp instanceof Point3D) 
		{
			Point3D p = (Point3D) temp;
			p.setX(10);
			p.setY(20);
			p.setZ(30);
			p.show();
		}
		else 
		{
			temp.setX(100);
			temp.setY(200);
			temp.show();
		}
	}
	public static void main(String[] args) 
	{
		Point p = new Point3D(); // 부모 클래스의 객체에 저장가능(업캐스트)
		call(p);
		System.out.println("=======================");
		Point x = new Point();
		call(x);
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("연습프레임");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 30, 500, 500);
		
		
		
	}
}
