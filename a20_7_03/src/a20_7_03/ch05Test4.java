package a20_7_03;
// 최대공약수, 최소공배수
public class ch05Test4 
{
	public static void main(String[] args) 
	{
		int a=4, b=6,i, small;
		small=(a>b)?b:a;
		for(i=small;i>=1;i--) 
		{
			if(a%i==0 && b%i==0) break;
		}System.out.println("최대공약수 ="+ i);
		for(i=small;i<=a*b;i++) 
		{
			if(i%a==0 && i%b==0) break;
		}System.out.println("최소공배수 ="+ i);
	}
}
