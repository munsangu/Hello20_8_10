package a20_7_14;

public class Point 			// 클래스: 멤버변수와 멤버메소드로 구성된 구조
{						    // 일반적으로 멤버변수는 private이라는 접근지정자를 붙임. 멤버메소드는 public이라는 접근지정자를 붙임
	private int x,y;        // <접근지정자>: 접근 가능 여부를 정하는 것 private, public, protected, 생략형
	public void show()      // protected -> 관계가 있는 것에만 공개(부모-자식 관계)
	{	
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	public int getX() 
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
	public void set(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
}

