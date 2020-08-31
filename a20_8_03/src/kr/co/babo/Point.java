package kr.co.babo;

public class Point 
{
	private int x,y;
	public Point() {}
	public  Point(int x, int y ) 
	{
		this.x=x;
		this.y=y;
	}
	public void setX(int x)      //  멤버 변수에 값을 저장
	{
		this.x=x;
	}
	public void setY(int y) 
	{
		this.y=y;
	}
	public int getX() 
	{
		return this.x;
	}
	public int getY() 
	{
		return this.y;
	}
	public void show() 
	{
		System.out.println(x+","+y);
	}
}
