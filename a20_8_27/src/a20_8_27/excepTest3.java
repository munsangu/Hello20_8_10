package a20_8_27;
public class excepTest3 
{
	public static void main(String[] args)
	{
		try
		{
		Exception e = new Exception("������");
		throw e;	// e ��ü ������ �߻���Ŵ
		}
		catch(Exception e)
		{
			System.out.println("�� "+e);
		}
		
	}
}
