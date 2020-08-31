package a20_7_02;

public class basic4MOD 
{
	public static void main(String[] args) 
	{
		int n=0,h=0;
		do 
		{
			n=n+1;
			if(n%2==1) h=h+n;
			else h=h-n;
		}while(n<100);
		 System.out.println(h);
	}
	
}
