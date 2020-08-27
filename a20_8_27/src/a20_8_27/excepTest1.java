package a20_8_27;
// ¿Õº¡º«
public class excepTest1 
{
	public static void main(String[] args) 
	{
		int a,res=0;
		try 
		{
		a=10;
		res=a/0;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(res);
		
	}
}
