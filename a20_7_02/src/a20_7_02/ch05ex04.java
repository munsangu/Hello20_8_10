package a20_7_02;

public class ch05ex04
{
	public static void main(String[] args) 
	{
		int a,b,cnt;
		cnt=0;
		for(a=1;a<=3;a++) 								// 3ȸ
		{
			for(b=1;b<=2;b++) 							// 2ȸ
			{
				System.out.println("�� �� ����");
				System.out.println("("+a+","+b+")");	// �� 6ȸ
				cnt=cnt+1;
			}
		}
		System.out.println("�� "+cnt+"ȸ ������");
	}

}
