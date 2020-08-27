package a20_8_27;
class circle
{
	private int r;
	private double res;
	public circle() {}
	public circle(int r) 
	{
		this.r=r;
	}
	public void cal() 
	{
		res = r*r*Math.PI;
	}
	public void show() 
	{
		System.out.println(res);
	}
	public static circle instance = new circle(5);
	public static circle getInstance() 
	{
		return instance;
	}
}
class rectangle
{
	private int w,h;
	private int res;
	public rectangle() {}
	public rectangle(int w) 
	{
		this.w=w;
	}
	public rectangle(int w, int h) 
	{
		this.w=w;
		this.h=h;
	}
	public void cal() 
	{
		res = w*h;
	}
	public void show() 
	{
		System.out.println(res);
	}
	public static rectangle rec = new rectangle(10,5);
	public static rectangle getRec() 
	{
		return rec;
	}
}

public class innerTest2 
{	
	public static void main(String[] args) 
	{
		circle c = new circle(5);			// 1)
		c.cal();
		c.show();
		circle c1 = circle.getInstance(); 	// 2)
		c1.cal();
		c1.show();
		
		rectangle r = rectangle.getRec();
		r.cal();
		r.show();
	}
}
