package a20_7_17;
import java.util.Scanner;
public class Uclid2 
{
	public static void main(String[] args) 
	{
		int a,b, r=1,high,low,l = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�");
		a = sc.nextInt();
		b = sc.nextInt();
			if(a>b) 
				{
					high = a; low = b;
				}
			else 
				{
					high = b; low = a;
				}
				while(r>0)
				{
					r=high%low; 
					high = low; 
				    low = r;
				}
			    l = (a*b)/high;
			    System.out.println("�ִ����� = "+high + " , "+"�ּҰ����="+l);
	}
}

