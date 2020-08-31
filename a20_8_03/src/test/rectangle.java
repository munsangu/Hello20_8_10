package test;
public class rectangle extends shape 
{
	private int x,y;
	public void area() 
	{
		res=x*y;
	}
	public rectangle() {}
	public rectangle(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
}
