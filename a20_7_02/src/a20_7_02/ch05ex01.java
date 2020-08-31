package a20_7_02;
// 1-100까지 출력(while)
// 합계 구하기
// 5의 배수의 갯수
public class ch05ex01 
{
	public static void main(String[] args) 
	{
		int a,sum,cnt;
		double na;
		a=1;
		sum=0;
		cnt=0;
		na=a-a/5*5;
		while(a<=100) 
		{
			if(na==0) 
				{
				cnt=cnt+1; 
				}
			System.out.println(a);
			sum=sum+a;
			a++;
		}
	System.out.println("합계 = "+sum);
	System.out.println("5의 배수의 갯수 = "+cnt+"개");
	}
}
