package a20_7_02;
public class basic3MOD
{
	public static void main(String[] args) 
	{
		int n=0,h=0;
		do 
		{
			n=n+1;
			if(n%2==1) h=h+n*n;
		}while(n<99);
		System.out.println(h);
	}
}
