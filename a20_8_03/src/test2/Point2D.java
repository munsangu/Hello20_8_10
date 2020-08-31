package test2;
public class Point2D 
{
	protected int x,y;
	public Point2D() 
	{
		System.out.println("2D »ý¼ºÀÚ");
	}
	public Point2D(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	public void show() 
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
