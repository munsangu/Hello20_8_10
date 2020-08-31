package test2;
public class rectangle 
{
	public static rectangle getRectangle() 
	{
		return new rectangle();
	}
	int x,y;
	double res;
	public rectangle() {}
	public void cal() 
	{
		res=x*y;
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
