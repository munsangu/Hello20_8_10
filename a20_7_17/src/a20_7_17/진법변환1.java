package a20_7_17;
import java.util.Scanner;
public class ������ȯ1 
{
	public static void main(String[] args) 
	{
		int b[]	= new int[10];
		int s=0;
		int d, mok, nmg;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��ȯ�� �� ���ڸ� �Է��Ͻÿ�");
		d=sc.nextInt();
		do {
		mok=d/2;
		nmg=d-mok*2;
		b[s]=nmg;
		s++;
		d=mok;
		}while(mok!=0); 
			for(int i=s-1;i>=0;i--) 
			{
				System.out.print(b[i]);
			}
	}
}
