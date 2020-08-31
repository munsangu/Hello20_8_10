package a20_7_30;
class circle
	{
		private int r;
		private double res;
		public void setR(int r) 
		{
			this.r=r;
		}
		public void area() 
		{
			res=r*r*Math.PI;
		}
		public void show() 
		{
			System.out.println("¿ø ³ÐÀÌ = "+res);
		}
	
	}
public class StaticTest2 
{
	public static void main(String[] args) 
	{
		circle kim = new circle();
		kim.setR(5);
		kim.area();
		kim.show();
	}
}
