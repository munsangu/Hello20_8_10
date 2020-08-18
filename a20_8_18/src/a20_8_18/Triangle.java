package a20_8_18;
public class Triangle implements Shape 
{
	private int w,h;
	private double res;
	public Triangle() {}
	public Triangle(int w, int h) 
	{
		this.w = w;
		this.h = h;
	}
	public void area() 
	{
		res = (w*h)/2;
	}
	public void show() 
	{
		System.out.println("»ï°¢Çü ³ÐÀÌ: "+res);
	}
}
