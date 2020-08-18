package a20_8_18;
public class InterMain 
{
	public static void call(Shape s, int color) 
	{
		if(s instanceof Circle) 
		{
			Circle ct = (Circle) s;
			ct.area();
			ct.show();
		}
		else if(s instanceof Rectangle) 
		{
			Rectangle rt = (Rectangle)s;
			rt.area();
			rt.show();
		}
		else if(s instanceof Triangle) 
		{
			Triangle tt = (Triangle)s;
			tt.area();
			tt.show();
		}
		switch(color) 
		{
		case Shape.RED:System.out.println("»¡°­");break;
		case Shape.GREEN:System.out.println("³ì»ö");break;
		case Shape.BLUE:System.out.println("ÆÄ¶û");break;
		}
    }		
	public static void main(String[] args) 
	{
		Circle c = new Circle(5);
		call(c, Shape.RED);
		Rectangle r = new Rectangle(5,6);
		call(r, Shape.BLUE);
		Triangle t = new Triangle(5,6);
		call(t, Shape.GREEN);
	}
}
