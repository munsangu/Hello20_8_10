public class Circle extends Shape 
{
	private int r;
	@Override
	public void draw() 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void area() 
	{
		res=r*r*Math.PI;			
	}
	public void show() 
	{
		System.out.println("¿ø ³ÐÀÌ = "+res);
	}
	public int getR() 
	{
		return r;
	}
	public void setR(int r) 
	{
		this.r = r;
	}
	
	
}
