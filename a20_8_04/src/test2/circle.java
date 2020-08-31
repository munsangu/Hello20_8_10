package test2;
public class circle 
{
	public static circle getCircle() 
	{
		return new circle();
	}
	int r;
	double res;
	public circle() {}
	public void cal() 
	{
		res = r*r*Math.PI;
	}
	public int getR() 
	{
		return r;
	}
	public void setR(int r) 
	{
		this.r = r;
	}
	void show() 
	{
		System.out.println(res);
	}
}
