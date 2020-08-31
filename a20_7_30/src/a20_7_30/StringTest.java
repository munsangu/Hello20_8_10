package a20_7_30;
	class point 
	{
		private int x,y;
		public point(int x, int y) 
		{
			super();
			this.x = x;
			this.y = y;
		}
		public int getX() 
		{
			return x;
		}
		public void setX(int x) 
		{
			this.x = x;
		}
		public int getY() 
		{
			return y;
		}
		public void setY(int y) 
		{
			this.y = y;
		}
		public point() 
		{
			super();
		}
	public void show() 
	{
		System.out.println(x+","+y);
	}
	public boolean equals(Object obj) 
	{
		point pt;
		if(obj instanceof point) 
		{
			pt=(point) obj;
			if(pt.x==this.x && pt.y==this.y) return true;
		}
		return false;
	}
}
public class StringTest 
{
	public static void main(String[] args) 
	{
	point sp = new point(10,20);
	sp.show();
	point ep = new point(10,20);
	ep.show();
	if(sp==ep) System.out.println("같다");
	else System.out.println("다르다");
	if(sp.equals(ep))System.out.println("같다");
	else System.out.println("다르다");
	}
}

