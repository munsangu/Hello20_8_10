package selfstudy;
public class CallByReferenceTest 
{
	public static void swap(Number z) 
	{
		int temp = z.x;
		z.x=z.y;
		z.y=temp;
	}
	public static void main(String[] args)
	{
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		
		System.out.println("swap() �޼ҵ� ȣ�� ��: "+n.x+","+n.y);
		swap(n);
		System.out.println("swap() �޼ҵ� ȣ�� ��: "+n.x+","+n.y);			
	}
}	
	class Number
	{
		public int x;
		public int y;
	}

