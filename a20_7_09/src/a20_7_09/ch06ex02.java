package a20_7_09;
import java.util.Scanner;

public class ch06ex02 
{
	public static int sign(int a) 
	{
		int res=0;
		if(a>0) res=1; 
		else if(a<0) res=-1;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("�Ǻ��� ���ڸ� �Է��Ͻÿ�");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int tot=sign(i);
		System.out.println("����� "+sign(i));
		System.out.println("============================");
		System.out.println(sign(-40));
		System.out.println(sign(0));
		System.out.println("============================");
	}
}