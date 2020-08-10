package a20_8_05;
public class Study 
{
	public static void poly(Shape sh)
	{
		if(sh instanceof Circle) 
		{
		Circle cx = new Circle();
		cx.setR(5);
		cx.area();
		cx.show();
		}
		else if(sh instanceof Rectangle) 
		{
		Rectangle rx = new Rectangle();
		rx.setWH(5, 4);
		rx.area();
		rx.show();
		}
		else if(sh instanceof Triangle) 
		{
		Triangle tx = new Triangle();
		tx.setWH(5, 4);
		tx.area();
		tx.show();
		}
	}
}
