package a20_7_01;
// a�� 1���� 100���� 1�� �����ϵ�
//3�� ��� �հ�(sum)�� ����(cn)���ϱ�
public class ch05ex01 
{
	public static void main(String[] args) 
	{
		int a, na, cn=0, sum=0;
			for(a=1;a<=100;a++) 
				{
					na = a-(a/3)*3; //na=a%2
					if(na==0) 
					{
						sum=sum+a;
						cn=cn+1;
					}
				}
			System.out.println("�� = "+sum);
			System.out.println("���� = "+cn+"��");
			System.out.println("��� = "+(double)sum/cn);
	}
}
