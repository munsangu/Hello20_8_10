package a20_8_17;

final class parentTest{}   // ��� �Ұ�
public class finalTest  
{
	final int X=1;  // x=1�� ���������� �ٲ� �� ����
	final double PI = 3.141592; // final ������ �Ϲ������� �빮�� ���
	
	public final void show()  // ������(overriding)�ȵ�
	{
		System.out.println(X);
	}
	public static void main(String[] args) 
	{
		//X=X+10; X=100;    // ����
	}
}
