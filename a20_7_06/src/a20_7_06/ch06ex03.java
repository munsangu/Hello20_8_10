package a20_7_06;
import java.util.Scanner;
public class ch06ex03 
{
	public static void main(String[] args) 
	{
		int jumsu[]=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) 
		{
			System.out.println((i+1)+"��° ���� �Է��Ͻÿ�");
			jumsu[i]=sc.nextInt();
			System.out.println("jumsu["+i+"] = "+jumsu[i]+"��");
			sum=sum+jumsu[i];		
		}System.out.println("�������� �հ� = "+sum+"��");
	}
}
