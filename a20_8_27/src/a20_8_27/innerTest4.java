package a20_8_27;
class Outer1									// �ٱ� Ŭ����
{
	int outdata = 100;							// �ٱ� Ŭ���� > ����
	Object method() 							// �ٱ� Ŭ���� > �޼ҵ�
	{
		final int data = 200;					// �ٱ�Ŭ���� > �޼ҵ� > ����
		class Inner								// �ٱ�Ŭ���� > �޽��� > Ŭ����
		{
			public String toString() 
			{									// �ٱ�Ŭ���� > �޼ҵ� > Ŭ���� > �޼ҵ�
				return "��� = "+(outdata+data);
			}
		}
		return new Inner();
	}
}
public class innerTest4 
{
	public static void main(String[] args) 
	{
		Outer1 out = new Outer1();
		Object obj = out.method();
		System.out.println(obj.toString());
	}
}
