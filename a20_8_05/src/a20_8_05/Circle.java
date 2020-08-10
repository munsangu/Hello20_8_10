package a20_8_05;

public class Circle extends Shape 
{
	private int r;
	public void setR(int r) 
	{
		this.r = r;
	}
	@Override
	public double area() 
	{
		res = r*r*Math.PI;
		return res;
	}
	@Override
	public void show() 
	{
		System.out.println("¿ø ³ĞÀÌ = "+res);
	}
}
