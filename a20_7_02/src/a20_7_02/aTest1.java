package a20_7_02;

public class aTest1 // �̸� �ٲܶ����� F2
{
	public static void main(String[] args) 
	{
		int a, sum, cnt;
		sum=0;
		cnt=0;
		for(a=77;a>=1;a--) 
		{
			if(a%2==0)
				{
				sum=sum+a;
				cnt=cnt+1;
				}
		}
		System.out.println("�� = "+sum);
		System.out.println("���� = "+cnt+"��");
		System.out.println("��� = "+sum/(double)cnt);
	}
}
