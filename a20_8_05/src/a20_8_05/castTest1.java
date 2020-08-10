package a20_8_05;

class Point2D
{
	public int x,y;
	public void show() 
	{
		System.out.println("2D show!");
	}
}

class Point3D extends Point2D
{
	public int z;
	public void show() 
	{
		System.out.println("3D show!");
	}
}
public class castTest1 
{
	public static void main(String[] args) 
	{
		Point3D pt = new Point3D();
		Point2D up = pt;
		System.out.println(up.x);
		System.out.println(up.y);
//		System.out.println(up.z);  Error ¹ß»ý
		up.show();
	}
}
