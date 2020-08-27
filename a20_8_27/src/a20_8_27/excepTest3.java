package a20_8_27;
public class excepTest3 
{
	public static void main(String[] args)
	{
		try
		{
		Exception e = new Exception("연습용");
		throw e;	// e 객체 던져서 발생시킴
		}
		catch(Exception e)
		{
			System.out.println("끝 "+e);
		}
		
	}
}
