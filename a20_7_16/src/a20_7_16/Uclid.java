package a20_7_16;
import java.util.Scanner;
public class Uclid 
{
	public static void main(String[] args) 
	{
		int a,b,small, big, nmg, gcm, lcm;
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�");
		a=sc.nextInt();
		b=sc.nextInt();		
			if(a>=b) 
			{
				big = a;
				small = b;
			}
			else 
			{
				small = a;
				big = b;
			}
			nmg = big%small;
			while(nmg!=0)
			{
				big = small;
				small = nmg;
				nmg = big%small;
			}
			gcm=small;
			lcm=(a*b)/gcm;
			System.out.println("�ִ����� = "+gcm+" , "+"�ּҰ���� = "+lcm);
	}
}
