package selfstudy;
public class CallByVauleTest 
{
	public static void swap(int x, int y) 
	{
		int 
		temp = x;
		x = y;
		y = temp;
	}
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		System.out.println("swap() �޼ҵ� ȣ�� ��: "+a+","+b);
		swap(a,b);
		System.out.println("swap() �޼ҵ� ȣ�� ��: "+a+","+b);
	}
}
