package a20_8_27;
class Outer
{
	int outData = 100;
	public void show() 
	{
		System.out.println("-----");
	}
	class Inner
	{
		int inData=200;
		public void print() 
		{
			System.out.println(outData);
			show();
		}
	}
}
public class innerTest1 
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();			// �ٱ��� Ŭ������ out ��ü ����
		Outer.Inner in = out.new Inner();   // ���� Ŭ������ in ��ü ����
		in.print();
		
	}
}
