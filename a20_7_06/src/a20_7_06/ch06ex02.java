package a20_7_06;
import java.util.Scanner;
// a �迭�� ��ĳ�ʸ� �̿��Ͽ�, 5���� �����͸� �Է¹޾Ƽ� �迭�� ����� ���� ��� ����ϰ� �հ豸�ϱ�
public class ch06ex02 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int sum=0;
		int i;
		Scanner sc= new Scanner(System.in);
		for(i=0;i<5;i++) 
		{
		a[i]=sc.nextInt();
		System.out.println("a["+i+"]"+"="+a[i]);
		sum=sum+a[i];
		}System.out.println("�迭�� ����� ������ �� = "+sum);
	}
}
