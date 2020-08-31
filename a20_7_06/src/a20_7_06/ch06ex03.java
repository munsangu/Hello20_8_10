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
			System.out.println((i+1)+"번째 점수 입력하시오");
			jumsu[i]=sc.nextInt();
			System.out.println("jumsu["+i+"] = "+jumsu[i]+"점");
			sum=sum+jumsu[i];		
		}System.out.println("점수들의 합계 = "+sum+"점");
	}
}
