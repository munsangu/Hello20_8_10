package a20_7_01;
import java.util.Scanner;

//5ȸ ����(jumsu)�� �Է� ���� �� ������ ������ �޾Ƽ� ��� ���ϱ�
public class ch05ex02 
{
	public static void main(String[] args) 
	{
		int i, jumsu, cn=0, sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=5;i++) 
		{
			jumsu=sc.nextInt();
			sum=sum+jumsu;
			cn=cn+1;
		}
		avg=(double) sum/cn;
		System.out.println("����: "+sum+"��");
		System.out.println("���: "+avg+"��");
		System.out.println("����: "+cn+"��");
	}
}
