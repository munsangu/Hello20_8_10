package a20_7_02;

public class ch05ex04
{
	public static void main(String[] args) 
	{
		int a,b,cnt;
		cnt=0;
		for(a=1;a<=3;a++) 								// 3회
		{
			for(b=1;b<=2;b++) 							// 2회
			{
				System.out.println("몇 번 돌까");
				System.out.println("("+a+","+b+")");	// 총 6회
				cnt=cnt+1;
			}
		}
		System.out.println("총 "+cnt+"회 돌았음");
	}

}
