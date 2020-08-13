public class Triangle extends Shape
{
	private int w,h;
	@Override
	public void area() 
	{
		res = (w*h)/2;
	}
	@Override
	public void draw() 
	{
		// TODO Auto-generated method stub
	}
	public void show() 
	{
		System.out.println("»ï°¢Çü ³ÐÀÌ = "+res);
	}
	public int getW() 
	{
		return w;
	}
	public void setW(int w) 
	{
		this.w = w;
	}
	public int getH() 
	{
		return h;
	}
	public void setH(int h) 
	{
		this.h = h;
	}
	
}
