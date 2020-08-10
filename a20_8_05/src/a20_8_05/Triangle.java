package a20_8_05;

public class Triangle extends Shape 
{
	int w,h;
	public void setWH(int w,int h) 
	{
		this.w = w;
		this.h = h;
	}
	@Override
	public double area() 
	{
		res=(w*h)/2;
		return res;
	}

	@Override
	public void show() 
	{
		System.out.println("»ï°¢Çü ³ĞÀÌ = "+res);
	}

}
