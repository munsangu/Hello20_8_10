package a20_7_03;
public class basic7 
{
	public static void main(String[] args) 
	{
		long n=1,h=1;
		do
		{
			n++;
			h=h*n;
		}
		while(n<20);
		System.out.println(h); // ������� �ʹ� ũ�� ������ 0���� ����
	}
}
