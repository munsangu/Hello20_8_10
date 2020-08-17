package selfstudy;
public class CallByValueTest2 
{
	static int a;
	static int b;
	
	public static void swap() 
	{
		int temp=a;
		a=b;
		b=temp;
	}
	public static void main(String[] args)
	{
		a = 10;
		b = 20;
		System.out.println("swap() 메소드 호출 전: "+a+","+b);
		swap();
		System.out.println("swap() 메소드 호출 후: "+a+","+b);
	}
}
