package a20_7_06;
//1 ~ 100까지 짝수의 합계
public class aTest1 
{
	public static void main(String[] args) 
	{
		int a,hap=0;
		for(a=1;a<=100;a++) 
		{
			if(a%2==0)hap=hap+a;
		}System.out.println("1부터 100까지 짝수들의 합 = "+hap);
	}
}