package selfstudy;
public class ShortCircuitTest 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 4;
		
		if((++a>3)&&(++b>8)) 
		{
			System.out.println("if���� ����Ǿ����ϴ�.");
		}
		
		System.out.println("a : "+a+", b : "+b);
	}
}
