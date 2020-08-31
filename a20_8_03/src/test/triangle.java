package test;
public class triangle extends shape 
{
	private int x,y;
	public void area() 
	{
		res=(x*y)/2;
	}
	public triangle() {}
	public triangle(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
}
