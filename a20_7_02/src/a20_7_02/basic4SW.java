package a20_7_02;
public class basic4SW 
{
	public static void main(String[] args)
	{
		int n=0, h=0, sw=0;
		do 
		{
			n=n+1;
			if(sw==0) 
				{	
				h=h+n;
				sw=1;
				}
			else
				{
				h=h-n;
				sw=0;
				}
		}while(n<100); 
		System.out.println(h);
	}
}
