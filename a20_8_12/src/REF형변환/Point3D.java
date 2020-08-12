package REFÇüº¯È¯;
public class Point3D extends Point 
{
	private int z;
	public void show() 
	{
		super.show();
		System.out.println("z = "+z);
	}
	public Point3D() 
	{
		super();
		
	}
	public Point3D(int x, int y, int z) 
	{
		super(x, y);
		this.z=z;
		
	}
	public Point3D(int z) 
	{
		super();
		this.z = z;
	}
	public int getZ() 
	{
		return z;
	}
	public void setZ(int z) 
	{
		this.z = z;
	}	
}
