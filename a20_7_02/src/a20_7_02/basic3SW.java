package a20_7_02;
public class basic3SW
{
	public static void main(String[] args) 
	{
		int n=0,h=0, sw=0;
		do 
		{
			n=n+1;
			if(sw==0) 
			{
				h=h+(n*n);
				sw=1;
			}
			else;
				sw=0;
		}while(n<99);
		System.out.println(h); 
	}
}
