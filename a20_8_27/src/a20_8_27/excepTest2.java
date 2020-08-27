package a20_8_27;

public class excepTest2 
{
	public static void main(String[] args) 
	{
		String name=null;
		int a=10;
		int b=0;
		int c=0;
		try 
		{
			//c=a/b;
			name=name.toString()+"연습";
		}
		catch (ArithmeticException e) 
		{
			System.out.println("산술 에러"+e);
		}
		catch (NullPointerException e) 
		{
			System.out.println("널포인트 에러"+e);
		}
		catch (Exception e) 
		{
			System.out.println("에러"+e);
		}
		finally 
		{
			System.out.println("종료될 예정");
		}
		System.out.println(name);
		System.out.println(c);
	}
}
