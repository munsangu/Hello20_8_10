package a20_7_08;
public class ch06ex01 
{
	public static void main(String[] args) 
	{
		String a[]=new String[5];
		int len=a.length;
		String b[]=new String[len];
		a[0]="대한민국";
		a[1]="일본";
		a[2]="미국";
		a[3]="일본";
		int x=0;
		for(int i=0;i<4;i++) 
		{
			if(a[i]!="일본") 
			{
				b[x]=a[i];
				x++;
			}
		}
		for(int i=0;i<x;i++) 
		{
			System.out.println((i+1)+"번째 b["+i+"]의 값: "+b[i]);
		}
	}
}
