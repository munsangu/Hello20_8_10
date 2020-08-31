package test2;
public class triangle 
{
	public static triangle getTriangle() 
	{
		return new triangle();
	}
	int x,y;
	double res;
	public triangle() {}
	public void cal() 
	{
		res = (x*y)/2;
	}
	
	public int getX() 
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	void show() 
	{
		System.out.println(res);
	}
}
